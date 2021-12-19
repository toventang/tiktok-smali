package com.bytedance.ugc.a.a;

import android.view.View;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.ugc.a.c;
import com.bytedance.ugc.glue.UGCTools;
import h.f.b.l;

public final class d extends c.e<TextView> {

    /* renamed from: a  reason: collision with root package name */
    public static final d f45830a = new d();

    private d() {
    }

    static {
        Covode.recordClassIndex(27915);
    }

    /* Return type fixed from 'android.view.View' to match base method */
    @Override // com.bytedance.ugc.a.c.e
    public final /* synthetic */ TextView b(View view) {
        l.c(view, "");
        if (!(view instanceof TextView)) {
            view = null;
        }
        return (TextView) view;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [android.view.View] */
    @Override // com.bytedance.ugc.a.c.e
    public final /* synthetic */ int a(TextView textView) {
        String str;
        TextView textView2 = textView;
        l.c(textView2, "");
        CharSequence text = textView2.getText();
        if (text != null) {
            str = text.toString();
        } else {
            str = null;
        }
        if (UGCTools.isEmpty(str)) {
            return 0;
        }
        return 1;
    }
}
