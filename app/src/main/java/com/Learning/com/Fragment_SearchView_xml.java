package com.Learning.com;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import br.tiagohm.codeview.CodeView;
import br.tiagohm.codeview.Language;
import br.tiagohm.codeview.Theme;

public class Fragment_SearchView_xml extends Fragment implements CodeView.OnHighlightListener {
    private ProgressDialog mProgressDialog;
    private int themePos = 0;
    CodeView mCodeView,mcodeview2;
    TextView title2;
    String Code=" <RelativeLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
            "    android:layout_width=\"fill_parent\"\n" +
            "    android:layout_height=\"fill_parent\">\n" +
            "\n" +
            "    <SearchView\n" +
            "        android:id=\"@+id/search\"\n" +
            "        android:layout_width=\"fill_parent\"\n" +
            "        android:layout_height=\"wrap_content\"\n" +
            "        android:iconifiedByDefault=\"false\">\n" +
            "\n" +
            "        <requestFocus />\n" +
            "    </SearchView>\n" +
            "\n" +
            "    <ListView\n" +
            "        android:id=\"@+id/listview\"\n" +
            "        android:layout_width=\"fill_parent\"\n" +
            "        android:layout_height=\"fill_parent\"\n" +
            "        android:layout_below=\"@+id/search\" />\n" +
            "\n" +
            "</RelativeLayout>";
    String code2="<LinearLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
            "    android:layout_width=\"fill_parent\"\n" +
            "    android:layout_height=\"fill_parent\"\n" +
            "    android:orientation=\"horizontal\"\n" +
            "    android:padding=\"10dp\">\n" +
            "\n" +
            "    <TextView\n" +
            "        android:id=\"@+id/nameLabel\"\n" +
            "        android:layout_width=\"wrap_content\"\n" +
            "        android:layout_height=\"wrap_content\"\n" +
            "        android:text=\"Version : \"/>\n" +
            "\n" +
            "    <TextView\n" +
            "        android:id=\"@+id/name\"\n" +
            "        android:layout_width=\"wrap_content\"\n" +
            "        android:layout_height=\"wrap_content\"\n" +
            "     />\n" +
            "\n" +
            "</LinearLayout>";

    @Override
    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstancetate) {
        View view = inflater.inflate(R.layout.two_heading_codeview_xml, container, false);
        mCodeView = (CodeView)view.findViewById(R.id.codeView);
        mcodeview2 = (CodeView)view.findViewById(R.id.codeView2);
        title2=(TextView)view.findViewById(R.id.title2);
        title2.setText("listview_items.xml");

        mCodeView.setOnHighlightListener(this)
                .setOnHighlightListener(this)
                .setTheme(Theme.DARCULA)
                .setCode(Code)
                .setLanguage(Language.XML)
                .setWrapLine(true)
                .setFontSize(12)
                .setZoomEnabled(false)
                .setShowLineNumber(false)
                .apply();
        mcodeview2.setOnHighlightListener(this)
                .setOnHighlightListener(this)
                .setTheme(Theme.DARCULA)
                .setCode(code2)
                .setLanguage(Language.XML)
                .setWrapLine(true)
                .setFontSize(12)
                .setZoomEnabled(false)
                .setShowLineNumber(false)
                .apply();
        return view;
    }


    @Override
    public void onStartCodeHighlight() {

    }

    @Override
    public void onFinishCodeHighlight() {

    }

    @Override
    public void onLanguageDetected(Language language, int i) {

    }

    @Override
    public void onFontSizeChanged(int i) {

    }

    @Override
    public void onLineClicked(int i, String s) {

    }
}

