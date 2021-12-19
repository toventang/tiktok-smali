package com.ss.android.ugc.aweme.question.viewmodel;

import androidx.fragment.app.e;
import androidx.lifecycle.ac;
import androidx.lifecycle.ad;
import androidx.lifecycle.ae;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.arch.widgets.base.c;
import h.f.b.l;
import h.p;

public final class QuestionDetailViewModel extends ac {

    /* renamed from: c  reason: collision with root package name */
    public static final a f120013c = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final c<Integer> f120014a = new c<>();

    /* renamed from: b  reason: collision with root package name */
    public final c<p<Integer, com.ss.android.ugc.aweme.question.e.a>> f120015b = new c<>();

    static {
        Covode.recordClassIndex(77987);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(77988);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static QuestionDetailViewModel a(e eVar) {
            l.d(eVar, "");
            ac a2 = ae.a(eVar, (ad.b) null).a(QuestionDetailViewModel.class);
            l.b(a2, "");
            return (QuestionDetailViewModel) a2;
        }
    }
}
