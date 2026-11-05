package doc.qlx.sro;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        // إنشاء الـ WebView برمجياً
        webView = new WebView(this);
        setContentView(webView);

        // تفعيل الجافاسكريبت
        webView.getSettings().setJavaScriptEnabled(true);
        
        // منع فتح الروابط في المتصفح الخارجي
        webView.setWebViewClient(new WebViewClient());

        // تحميل الموقع
        webView.loadUrl("https://klencod.github.io/PDF/");
    }

    // دعم زر الرجوع
    @Override
    public void onBackPressed() {
        if (webView.canGoBack()) {
            webView.goBack();
        } else {
            super.onBackPressed();
        }
    }
}