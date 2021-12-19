package com.ss.android.ugc.aweme.share.improve;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.setting.ce;
import com.ss.android.ugc.aweme.sharer.ui.h;
import h.f.b.l;
import java.util.Comparator;
import java.util.List;

public final class d implements Comparator<h> {

    /* renamed from: a  reason: collision with root package name */
    public static final a f123847a = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private final int f123848b = 1000;

    /* renamed from: c  reason: collision with root package name */
    private final List<ce> f123849c;

    static {
        Covode.recordClassIndex(81290);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(81291);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public d() {
        com.ss.android.ugc.aweme.share.i.a a2 = com.ss.android.ugc.aweme.share.i.a.a();
        l.b(a2, "");
        this.f123849c = a2.f123567b;
    }

    private final int a(String str, List<? extends ce> list) {
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (TextUtils.equals(((ce) list.get(i2)).f122160a, str)) {
                return i2;
            }
        }
        return this.f123848b;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // java.util.Comparator
    public final /* synthetic */ int compare(h hVar, h hVar2) {
        h hVar3 = hVar;
        h hVar4 = hVar2;
        if (hVar3 == null) {
            return -1;
        }
        if (hVar4 == null) {
            return 1;
        }
        List<ce> list = this.f123849c;
        if (list == null || list.isEmpty()) {
            return 0;
        }
        return a(hVar3.c(), this.f123849c) - a(hVar4.c(), this.f123849c);
    }
}
