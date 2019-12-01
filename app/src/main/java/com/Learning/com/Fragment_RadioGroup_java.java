package com.Learning.com;

import android.app.ProgressDialog;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.Button;

import com.protectsoft.webviewcode.Codeview;
import com.protectsoft.webviewcode.Settings;

public class Fragment_RadioGroup_java extends Fragment {
    private ProgressDialog mProgressDialog;
    private int themePos = 0;
    String Code="import android.support.v7.app.AppCompatActivity;\n" +
            "import android.os.Bundle;\n" +
            "import android.widget.RadioGroup;\n" +
            "import android.widget.Switch;\n" +
            "import android.widget.Toast;\n" +
            "\n" +
            "public class MainActivity extends AppCompatActivity {\n" +
            "RadioGroup radioGroup;\n" +
            "    @Override\n" +
            "    protected void onCreate(Bundle savedInstanceState) {\n" +
            "        super.onCreate(savedInstanceState);\n" +
            "        setContentView(R.layout.activity_main);\n" +
            "        radioGroup=(RadioGroup)findViewById(R.id.rdgrp);\n" +
            "        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {\n" +
            "            @Override\n" +
            "            public void onCheckedChanged(RadioGroup group, int checkedId) {\n" +
            "                switch(checkedId){\n" +
            "                    case R.id.rb1:\n" +
            "                        Toast.makeText(MainActivity.this, \"Noughat\", Toast.LENGTH_SHORT).show();\n" +
            "                        break;\n" +
            "                    case R.id.rb2:\n" +
            "                        Toast.makeText(MainActivity.this, \"Oreo\", Toast.LENGTH_SHORT).show();\n" +
            "                        break;\n" +
            "                    case R.id.rb3:\n" +
            "                        Toast.makeText(MainActivity.this, \"Pie\", Toast.LENGTH_SHORT).show();\n" +
            "                        break;\n" +
            "                }\n" +
            "            }\n" +
            "        });\n" +
            "    }\n" +
            "}\n";
    @Override
    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstancetate) {
        View view = inflater.inflate(R.layout.one_heading_codeview, container, false);
        WebView webview = (WebView)view.findViewById(R.id.webview);
        Button copy=(Button)view.findViewById(R.id.copy);
        copy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ClipboardManager clipboard = (ClipboardManager) getActivity().getSystemService(Context.CLIPBOARD_SERVICE);
                ClipData clip = ClipData.newPlainText("clip", Code);
                clipboard.setPrimaryClip(clip);
            }
        });
        Codeview.with(getActivity().getApplicationContext())
                .withCode(Code)
                .setStyle(Settings.WithStyle.DARKULA)
                .setLang(Settings.Lang.JAVA)
                .into(webview);
        return view;
    }



}


