package com.ss.android.ugc.aweme.im.sdk.share.panel.viewmodel;

import android.content.Context;
import androidx.lifecycle.ac;
import androidx.lifecycle.t;
import com.bytedance.covode.number.Covode;
import h.f.b.m;
import h.h;
import h.i;

public final class SharePanelAndroidViewModel extends ac {

    /* renamed from: a  reason: collision with root package name */
    public static final a f103590a = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private final h f103591b = i.a((h.f.a.a) b.f103592a);

    static {
        Covode.recordClassIndex(66366);
    }

    public final t<Boolean> a() {
        return (t) this.f103591b.getValue();
    }

    public static final class a {
        static {
            Covode.recordClassIndex(66367);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static SharePanelAndroidViewModel a(Context context) {
            return (SharePanelAndroidViewModel) b.a(context, SharePanelAndroidViewModel.class);
        }
    }

    static final class b extends m implements h.f.a.a<t<Boolean>> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f103592a = new b();

        static {
            Covode.recordClassIndex(66368);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ t<Boolean> invoke() {
            return new t();
        }
    }
}
