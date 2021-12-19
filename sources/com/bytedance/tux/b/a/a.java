package com.bytedance.tux.b.a;

import android.content.Context;
import android.graphics.Typeface;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.b.g;
import com.bytedance.tux.h.d;
import h.f.b.l;
import h.p;
import java.util.Map;

public final class a extends b<TextView> {

    /* renamed from: a  reason: collision with root package name */
    private final e f44664a = new e();

    static {
        Covode.recordClassIndex(27310);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.util.Map] */
    @Override // com.bytedance.tux.b.a.b
    public final /* bridge */ /* synthetic */ Map a(TextView textView, Map map) {
        return a(textView, (Map<Integer, ? extends Object>) map);
    }

    public final Map<Integer, Object> a(TextView textView, Map<Integer, ? extends Object> map) {
        l.c(textView, "");
        l.c(map, "");
        return super.a((Object) textView, (Map<Integer, ? extends Object>) this.f44664a.a(textView, map));
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, int, java.lang.Object] */
    @Override // com.bytedance.tux.b.a.b
    public final /* synthetic */ boolean a(TextView textView, int i2, Object obj) {
        TextView textView2 = textView;
        l.c(textView2, "");
        l.c(obj, "");
        if (i2 == g.d().f44668a) {
            g.d();
            l.c(obj, "");
            textView2.setMinHeight(((Number) obj).intValue());
            return true;
        } else if (i2 == g.e().f44668a) {
            g.e();
            l.c(obj, "");
            textView2.setWidth(((Number) obj).intValue());
            return true;
        } else if (i2 == g.f().f44668a) {
            g.f();
            l.c(obj, "");
            textView2.setMinWidth(((Number) obj).intValue());
            return true;
        } else if (i2 == g.q().f44668a) {
            g.q();
            l.c(obj, "");
            textView2.setMaxWidth(((Number) obj).intValue());
            return true;
        } else if (i2 == g.g().f44668a) {
            Context context = textView2.getContext();
            l.a((Object) context, "");
            g.g();
            l.c(obj, "");
            Integer a2 = d.a(context, ((Number) obj).intValue());
            if (a2 != null) {
                textView2.setTextColor(a2.intValue());
            }
            return true;
        } else if (i2 == g.h().f44668a) {
            g.h();
            l.c(obj, "");
            textView2.setTextSize(1, ((Number) obj).floatValue());
            return true;
        } else if (i2 == g.j().f44668a) {
            g.j();
            l.c(obj, "");
            Typeface a3 = com.bytedance.tux.d.a.a((String) obj);
            if (a3 != null) {
                textView2.setTypeface(a3);
            }
            return true;
        } else if (i2 != g.i().f44668a) {
            return false;
        } else {
            g.i();
            l.c(obj, "");
            p pVar = (p) obj;
            textView2.setTypeface(Typeface.create((String) pVar.getFirst(), ((Number) pVar.getSecond()).intValue()));
            return true;
        }
    }
}
