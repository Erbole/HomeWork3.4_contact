package com.geektach.classwork34;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ContactViewHolder extends RecyclerView.ViewHolder {
    private TextView textView;
    public ContactViewHolder(@NonNull View itemView) {
        super(itemView);
        textView  = itemView.findViewById(R.id.tv_contact);
    }

    public void bind(String contact) {
        textView.setText(contact);
    }
}
