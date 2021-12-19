package com.ss.android.ugc.aweme.shortvideo;

import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.port.in.c;
import com.ss.android.ugc.aweme.shortvideo.view.HashTagMentionEditText;
import com.ss.android.ugc.aweme.shortvideo.view.MentionEditText;
import com.zhiliaoapp.musically.R;

public final class l {

    /* renamed from: c  reason: collision with root package name */
    public static final a f128636c = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final Fragment f128637a;

    /* renamed from: b  reason: collision with root package name */
    public final int f128638b = 0;

    /* renamed from: d  reason: collision with root package name */
    private eh f128639d;

    /* renamed from: e  reason: collision with root package name */
    private ViewGroup f128640e;

    /* renamed from: f  reason: collision with root package name */
    private ViewGroup f128641f;

    /* renamed from: g  reason: collision with root package name */
    private ViewGroup f128642g;

    static {
        Covode.recordClassIndex(84330);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(84331);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class b implements MentionEditText.c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ l f128646a;

        static {
            Covode.recordClassIndex(84332);
        }

        b(l lVar) {
            this.f128646a = lVar;
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.view.MentionEditText.c
        public final void a() {
            if (!c.u.a()) {
                c.f115626e.a(this.f128646a.f128637a, "", this.f128646a.f128638b);
            }
        }
    }

    public l(Fragment fragment, eh ehVar, View view) {
        h.f.b.l.d(fragment, "");
        h.f.b.l.d(ehVar, "");
        h.f.b.l.d(view, "");
        this.f128637a = fragment;
        this.f128639d = ehVar;
        this.f128640e = (ViewGroup) view.findViewById(R.id.hb);
        this.f128641f = (ViewGroup) view.findViewById(R.id.ben);
        this.f128642g = (ViewGroup) view.findViewById(R.id.ve);
        eh ehVar2 = this.f128639d;
        if (ehVar2 == null) {
            h.f.b.l.b();
        }
        HashTagMentionEditText hashTagMentionEditText = ehVar2.f128419c;
        h.f.b.l.b(hashTagMentionEditText, "");
        hashTagMentionEditText.setOnMentionInputListener(new b(this));
    }
}
