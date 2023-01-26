package com.nofliegroup.learningapp_for_kids;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;


public class AnimalFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    int animal[] = {R.drawable.lion, R.drawable.tiger, R.drawable.chicken, R.drawable.elephant};
    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public AnimalFragment() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_animal, container, false);

         ImageView iv = (ImageView) v.findViewById(R.id.imageView3);
        iv.setImageResource(animal[0]);

         GridView gv = v.findViewById(R.id.gridView2);
        gv.setNumColumns(animal.length);
        gv.setAdapter(new ImageAdapter(getContext()));

        gv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                iv.setImageResource(animal[position]);
            }
        });


        return v;
    }

    class ImageAdapter extends BaseAdapter {
Context context;
        public ImageAdapter(Context context) {
            this.context = context;

        }

        @Override
        public int getCount() {
            return animal.length;
        }

        @Override
        public Object getItem(int position) {
            return position;
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            ImageView iv = new ImageView(context);
            iv.setImageResource(animal[position]);
            iv.setLayoutParams(new ViewGroup.LayoutParams(200,200));


            return iv;
        }
    }
}