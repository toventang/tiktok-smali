package com.bytedance.ies.bullet.ui.common;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;

public interface k {

    public interface a {
        static {
            Covode.recordClassIndex(19778);
        }

        ImageView getBackView();

        ImageView getCloseAllView();

        ImageView getMoreButtonView();

        ImageView getReportView();

        ImageView getShareView();

        View getTitleBarRoot();

        TextView getTitleView();

        void setDefaultTitle(CharSequence charSequence);

        void setTitleBarBackgroundColor(int i2);
    }

    public interface b {
        static {
            Covode.recordClassIndex(19779);
        }

        View a(Context context, Uri uri, com.bytedance.ies.bullet.service.f.a.b bVar);

        void a(View.OnClickListener onClickListener);

        void a(CharSequence charSequence);

        void b(View.OnClickListener onClickListener);
    }

    static {
        Covode.recordClassIndex(19777);
    }
}
