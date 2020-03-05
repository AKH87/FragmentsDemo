package org.sample.fragmentsdemo;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class Fragment1 extends Fragment {
    String tagName = "STATUS";

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Log.i(tagName, "Fragment Attached");
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.i(tagName, "Fragment Resumed");
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Log.i(tagName, "Fragment View Created");
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i(tagName, "Fragment onCreate");
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Log.i(tagName, "Fragment onCreateView");
        return inflater.inflate(R.layout.fragment1, container, false);
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.i(tagName, "Fragment Pause");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.i(tagName, "Fragment Stopped");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.i(tagName, "Fragment onViewDestroy");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.i(tagName, "Fragment Destroyed");
    }

    @Override
    public void onDetach() {
        super.onDetach();
    }

    @Override
    public void onStart() {
        super.onStart();
    }
}
