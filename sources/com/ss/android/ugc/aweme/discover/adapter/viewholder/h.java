package com.ss.android.ugc.aweme.discover.adapter.viewholder;

import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.discover.adapter.viewholder.CustomLayout;
import com.ss.android.ugc.aweme.discover.model.SearchIntermediateViewModel;
import com.ss.android.ugc.aweme.discover.ui.al;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class h extends a {

    /* renamed from: i  reason: collision with root package name */
    public static final a f80664i = new a((byte) 0);

    /* renamed from: h  reason: collision with root package name */
    public boolean f80665h;

    /* renamed from: j  reason: collision with root package name */
    private final CustomLayout f80666j;

    static {
        Covode.recordClassIndex(50171);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(50172);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public static final class b implements CustomLayout.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h f80667a;

        static {
            Covode.recordClassIndex(50173);
        }

        @Override // com.ss.android.ugc.aweme.discover.adapter.viewholder.CustomLayout.a
        public final void a() {
            this.f80667a.f80619b.setVisibility(8);
            this.f80667a.f80620c = false;
            this.f80667a.onPause();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        b(h hVar) {
            this.f80667a = hVar;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x008a, code lost:
        if (r8 == null) goto L_0x008c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00f0  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0113  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0145  */
    /* JADX WARNING: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    @Override // com.ss.android.ugc.aweme.discover.adapter.viewholder.a
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(com.ss.android.ugc.aweme.discover.model.suggest.Word r12, java.lang.String r13) {
        /*
        // Method dump skipped, instructions count: 342
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.discover.adapter.viewholder.h.a(com.ss.android.ugc.aweme.discover.model.suggest.Word, java.lang.String):void");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public h(View view, al.d dVar, SearchIntermediateViewModel searchIntermediateViewModel, Fragment fragment) {
        super(view, dVar, searchIntermediateViewModel, fragment);
        l.d(view, "");
        View findViewById = view.findViewById(R.id.dqk);
        l.b(findViewById, "");
        this.f80666j = (CustomLayout) findViewById;
    }
}
