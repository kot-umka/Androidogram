package ru.gordinmitya.androidogram;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class PostAdapter extends ArrayAdapter<PostModel> {
    LayoutInflater layoutInflater;

    public PostAdapter(@androidx.annotation.NonNull @NonNull Context context, int resource, @androidx.annotation.NonNull @NonNull List<PostModel> objects) {
        super(context, resource, objects);
        layoutInflater = LayoutInflater.from(context);
    }

    @androidx.annotation.NonNull
    @NonNull
    @Override
    public View getView(int position, @androidx.annotation.Nullable @Nullable View convertView, @androidx.annotation.NonNull @NonNull ViewGroup parent) {
        View view = convertView;
        if (view == null) {
            view = layoutInflater.inflate(R.layout.item_card, parent, false);
        }

        ImageView photoImage = view.findViewById(R.id.image_photo);
        TextView descriptionText = view.findViewById(R.id.text_photo);
        TextView dateText = view.findViewById(R.id.text_date);

        PostModel post = getItem(position);
        assert post != null;

        photoImage.setImageResource(post.getImageRes());
        descriptionText.setText(post.getDescription());
        dateText.setText(post.getDate());

        return view;
    }
}
