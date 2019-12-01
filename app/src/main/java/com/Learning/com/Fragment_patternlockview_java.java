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

public class Fragment_patternlockview_java extends Fragment {
    private ProgressDialog mProgressDialog;
    private int themePos = 0;
    String Code="import android.graphics.RadialGradient;\n" +
            "import android.support.v7.app.AppCompatActivity;\n" +
            "import android.os.Bundle;\n" +
            "import android.widget.RadioButton;\n" +
            "import android.widget.RadioGroup;\n" +
            "import android.widget.TextView;\n" +
            "import android.widget.Toast;\n" +
            "\n" +
            "import com.andrognito.patternlockview.PatternLockView;\n" +
            "import com.andrognito.patternlockview.listener.PatternLockViewListener;\n" +
            "import com.andrognito.patternlockview.utils.PatternLockUtils;\n" +
            "\n" +
            "import java.util.List;\n" +
            "\n" +
            "public class MainActivity extends AppCompatActivity {\n" +
            "PatternLockView patternLockView;\n" +
            "RadioGroup radioGroup;\n" +
            "String savedpattern=\"\";\n" +
            "    @Override\n" +
            "    protected void onCreate(Bundle savedInstanceState) {\n" +
            "        super.onCreate(savedInstanceState);\n" +
            "        setContentView(R.layout.activity_main);\n" +
            "        radioGroup=(RadioGroup)findViewById(R.id.radiogroup);\n" +
            "        patternLockView=(PatternLockView)findViewById(R.id.lockview);\n" +
            "        patternLockView.addPatternLockListener(new PatternLockViewListener() {\n" +
            "            @Override\n" +
            "            public void onStarted() {\n" +
            "\n" +
            "            }\n" +
            "\n" +
            "            @Override\n" +
            "            public void onProgress(List<PatternLockView.Dot> progressPattern) {\n" +
            "\n" +
            "            }\n" +
            "\n" +
            "            @Override\n" +
            "            public void onComplete(List<PatternLockView.Dot> pattern) {\n" +
            "                if(radioGroup.getCheckedRadioButtonId()==R.id.set){\n" +
            "                    savedpattern= PatternLockUtils.patternToString(patternLockView,pattern);\n" +
            "                    Toast.makeText(MainActivity.this, \"patten saved\", Toast.LENGTH_SHORT).show();\n" +
            "                }else {\n" +
            "                    if (PatternLockUtils.patternToString(patternLockView, pattern).equals(savedpattern))\n" +
            "                    {\n" +
            "                        Toast.makeText(MainActivity.this, \"correct pattern\", Toast.LENGTH_SHORT).show();\n" +
            "                    }else {\n" +
            "                        Toast.makeText(MainActivity.this, \"Incorrect pattern\", Toast.LENGTH_SHORT).show();\n" +
            "                    }\n" +
            "                }\n" +
            "            }\n" +
            "\n" +
            "            @Override\n" +
            "            public void onCleared() {\n" +
            "\n" +
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



