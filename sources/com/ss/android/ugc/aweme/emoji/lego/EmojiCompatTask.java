package com.ss.android.ugc.aweme.emoji.lego;

import android.content.Context;
import androidx.emoji.a.a;
import androidx.emoji.a.e;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.lego.ab;
import com.ss.android.ugc.aweme.lego.ad;
import com.ss.android.ugc.aweme.lego.ae;
import com.ss.android.ugc.aweme.lego.d;
import com.ss.android.ugc.aweme.lego.w;
import com.ss.android.ugc.aweme.lego.x;
import h.f.b.l;
import java.util.List;

public final class EmojiCompatTask implements w {

    /* renamed from: a  reason: collision with root package name */
    public static boolean f89353a;

    /* renamed from: b  reason: collision with root package name */
    public static final a f89354b = new a((byte) 0);

    static {
        Covode.recordClassIndex(56145);
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final int bK_() {
        return 1048575;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final ad f() {
        return x.a(this);
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final String g() {
        return "task_";
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final boolean i() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final List j() {
        return null;
    }

    public static final class a {
        static {
            Covode.recordClassIndex(56146);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public static final class b extends a.d {
        static {
            Covode.recordClassIndex(56147);
        }

        @Override // androidx.emoji.a.a.d
        public final void a() {
            EmojiCompatTask.f89353a = true;
        }

        b() {
        }
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final ab k() {
        return ab.DEFAULT;
    }

    @Override // com.ss.android.ugc.aweme.lego.w
    public final ae b() {
        if (d.b()) {
            return ae.BOOT_FINISH;
        }
        return ae.BACKGROUND;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final String h() {
        return getClass().getSimpleName();
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final void a(Context context) {
        l.d(context, "");
        e eVar = new e(context, new androidx.core.e.a("com.google.android.gms.fonts", "com.google.android.gms", "Noto Color Emoji Compat"));
        eVar.f2760b = false;
        l.b(eVar, "");
        androidx.emoji.a.a.a(eVar).a(new b());
    }
}
