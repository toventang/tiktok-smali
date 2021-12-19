package com.ss.android.ugc.aweme.tools.mvtemplate.a;

import android.content.Intent;
import androidx.fragment.app.e;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import h.f.b.l;
import h.z;
import java.util.ArrayList;

public abstract class f<RETURN_VALUE> {
    static {
        Covode.recordClassIndex(91917);
    }

    private f() {
    }

    public /* synthetic */ f(byte b2) {
        this();
    }

    public static final class a extends f<Intent> {

        /* renamed from: a  reason: collision with root package name */
        public final e f140771a;

        /* renamed from: b  reason: collision with root package name */
        public final ShortVideoContext f140772b;

        /* renamed from: c  reason: collision with root package name */
        public final ArrayList<MediaModel> f140773c;

        /* renamed from: d  reason: collision with root package name */
        public final boolean f140774d;

        /* renamed from: e  reason: collision with root package name */
        public final h.f.a.a<z> f140775e;

        /* renamed from: f  reason: collision with root package name */
        public final h.f.a.a<z> f140776f;

        static {
            Covode.recordClassIndex(91918);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(e eVar, ShortVideoContext shortVideoContext, ArrayList<MediaModel> arrayList, boolean z, h.f.a.a<z> aVar, h.f.a.a<z> aVar2) {
            super((byte) 0);
            l.d(eVar, "");
            l.d(shortVideoContext, "");
            l.d(arrayList, "");
            l.d(aVar, "");
            l.d(aVar2, "");
            this.f140771a = eVar;
            this.f140772b = shortVideoContext;
            this.f140773c = arrayList;
            this.f140774d = z;
            this.f140775e = aVar;
            this.f140776f = aVar2;
        }
    }
}
