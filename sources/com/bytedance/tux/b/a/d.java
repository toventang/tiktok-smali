package com.bytedance.tux.b.a;

import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.b.g;
import com.bytedance.tux.input.TuxTextView;
import h.f.b.l;
import java.util.Map;

public final class d extends b<TuxTextView> {

    /* renamed from: a  reason: collision with root package name */
    private final a f44665a = new a();

    static {
        Covode.recordClassIndex(27313);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.util.Map] */
    @Override // com.bytedance.tux.b.a.b
    public final /* bridge */ /* synthetic */ Map a(TuxTextView tuxTextView, Map map) {
        return a(tuxTextView, (Map<Integer, ? extends Object>) map);
    }

    public final Map<Integer, Object> a(TuxTextView tuxTextView, Map<Integer, ? extends Object> map) {
        l.c(tuxTextView, "");
        l.c(map, "");
        return super.a((Object) tuxTextView, (Map<Integer, ? extends Object>) this.f44665a.a((TextView) tuxTextView, map));
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, int, java.lang.Object] */
    @Override // com.bytedance.tux.b.a.b
    public final /* synthetic */ boolean a(TuxTextView tuxTextView, int i2, Object obj) {
        TuxTextView tuxTextView2 = tuxTextView;
        l.c(tuxTextView2, "");
        l.c(obj, "");
        if (i2 != g.l().f44668a) {
            return false;
        }
        g.l();
        l.c(obj, "");
        tuxTextView2.setTuxFont(((Number) obj).intValue());
        return true;
    }
}
