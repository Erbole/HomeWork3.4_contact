package com.geektach.classwork34;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class ContactFragment extends Fragment {
    private RecyclerView recyclerView;
    private ArrayList<String> contacts;
    private ContactAdapter contactAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_contact, container, false);

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        loadData();
        recyclerView = view.findViewById(R.id.recycler);
        contactAdapter = new ContactAdapter(contacts);
        recyclerView.setAdapter(contactAdapter);
    }

    private void loadData() {
        contacts = new ArrayList<>();
        contacts.add("GeekTech " +
                "\n +996 555 55 55 55");
        contacts.add("Скорая помощь" +
                "\n 101");
        contacts.add("Милиция" +
                "\n 102");
        contacts.add("Пожарныя" +
                "\n 103");
        contacts.add("Мама" +
                "\n +996 554 44 44 44");
        contacts.add("Папа" +
                "\n +996 999 99 99 99");
        contacts.add("Сестра" +
                "\n +996 222 22 22 22");
        contacts.add("Брат" +
                "\n +996 556 66 66 66");
        contacts.add("Служба поддержки Megacom" +
                "\n 0555");
        contacts.add("Служба поддержки" +
                "\n 911");
        contacts.add("Google" +
                "\n +91 884 885 22");
        contacts.add("Yandex" +
                "\n +888 88 88 888");
        contacts.add("Школа" +
                "\n +996 778 88 77 77");
    }
}