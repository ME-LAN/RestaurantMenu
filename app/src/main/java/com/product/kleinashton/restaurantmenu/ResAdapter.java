package com.product.kleinashton.restaurantmenu;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by keyur on 26-03-2018.
 */

public class ResAdapter extends ArrayAdapter<Word> {
    TextView resNametv,resCitytv;

    public ResAdapter(@NonNull Context context, @NonNull List<Word> objects) {
        super(context,0, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View resWordView = convertView;

        if(resWordView == null){
            resWordView = LayoutInflater.from(getContext()).inflate(R.layout.listrow_word, parent, false);
        }

        Word resWord = getItem(position);

        resNametv =  resWordView.findViewById(R.id.resname);
        resNametv.setText(resWord.getResName());

        resCitytv =  resWordView.findViewById(R.id.resCity);
        resCitytv.setText(resWord.getRescity());

        return resWordView;
    }


}
