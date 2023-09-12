package com.example.mypages;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebViewClient;

import com.example.mypages.databinding.FragmentWebViewBinding;

import java.security.Permission;

public class WebViewFragment extends Fragment {

    FragmentWebViewBinding binding;

    String url;
    WebViewFragment( String url ) {
        this.url = url;
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentWebViewBinding.inflate(inflater);
        binding.webview.getSettings().setJavaScriptEnabled(true);
        binding.webview.setWebViewClient(new WebViewClient());
        binding.webview.loadUrl(url);
        return binding.getRoot();
    }
}