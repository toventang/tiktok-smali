package com.bytedance.android.livesdk.rank.impl.ranks.a;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.livesdk.j.cp;
import com.bytedance.android.livesdk.rank.api.j;
import com.bytedance.android.livesdk.rank.impl.f;
import com.bytedance.android.livesdk.rank.impl.h;
import com.bytedance.android.livesdk.rank.impl.ranks.a.b;
import com.bytedance.android.livesdk.utils.ak;
import com.bytedance.android.livesdk.utils.ap;
import com.bytedance.android.livesdk.utils.p;
import com.bytedance.android.livesdk.v;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import h.a.n;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.util.ArrayList;
import java.util.HashMap;

public final class a extends v {

    /* renamed from: a  reason: collision with root package name */
    public static final C0431a f20775a = new C0431a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private boolean f20776b;

    /* renamed from: c  reason: collision with root package name */
    private long f20777c;

    /* renamed from: d  reason: collision with root package name */
    private long f20778d;

    /* renamed from: e  reason: collision with root package name */
    private ArrayList<Integer> f20779e;

    /* renamed from: f  reason: collision with root package name */
    private int f20780f = j.HOURLY_RANK.getType();

    /* renamed from: g  reason: collision with root package name */
    private b f20781g;

    /* renamed from: h  reason: collision with root package name */
    private b f20782h;

    /* renamed from: i  reason: collision with root package name */
    private Fragment f20783i;

    /* renamed from: j  reason: collision with root package name */
    private final ak.a f20784j = ak.a.PANEL_HOURLY;

    /* renamed from: k  reason: collision with root package name */
    private HashMap f20785k;

    static {
        Covode.recordClassIndex(12306);
    }

    @Override // com.bytedance.android.livesdk.v
    public final void a() {
        HashMap hashMap = this.f20785k;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.bytedance.android.livesdk.v
    public final View a_(int i2) {
        if (this.f20785k == null) {
            this.f20785k = new HashMap();
        }
        View view = (View) this.f20785k.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.f20785k.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    @Override // androidx.fragment.app.d, com.bytedance.android.livesdk.v, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        a();
    }

    /* renamed from: com.bytedance.android.livesdk.rank.impl.ranks.a.a$a  reason: collision with other inner class name */
    public static final class C0431a {
        static {
            Covode.recordClassIndex(12307);
        }

        private C0431a() {
        }

        public /* synthetic */ C0431a(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.android.livesdk.v
    public final ak.a c_() {
        return this.f20784j;
    }

    /* access modifiers changed from: package-private */
    public static final /* synthetic */ class b extends h.f.b.j implements h.f.a.a<z> {
        static {
            Covode.recordClassIndex(12308);
        }

        b(a aVar) {
            super(0, aVar, a.class, "dismiss", "dismiss()V", 0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            ((androidx.fragment.app.d) this.receiver).dismiss();
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final /* synthetic */ class c extends h.f.b.j implements h.f.a.a<z> {
        static {
            Covode.recordClassIndex(12309);
        }

        c(a aVar) {
            super(0, aVar, a.class, "dismiss", "dismiss()V", 0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            ((androidx.fragment.app.d) this.receiver).dismiss();
            return z.f158842a;
        }
    }

    @Override // com.bytedance.android.livesdk.v
    public final v.b b() {
        Boolean bool;
        int i2;
        int i3;
        int i4;
        int d2;
        DataChannel dataChannel = this.p;
        if (dataChannel != null) {
            bool = (Boolean) dataChannel.b(cp.class);
        } else {
            bool = null;
        }
        this.f20776b = p.d(bool);
        if (this.f20776b) {
            i2 = R.layout.b7y;
        } else {
            i2 = R.layout.b7z;
        }
        v.b bVar = new v.b(i2);
        if (this.f20776b) {
            i3 = R.style.a29;
        } else {
            i3 = R.style.a2_;
        }
        bVar.f22375b = i3;
        if (this.f20776b) {
            i4 = 80;
        } else {
            i4 = 5;
        }
        bVar.f22380g = i4;
        bVar.f22379f = 0.0f;
        int i5 = -1;
        if (this.f20776b) {
            d2 = -1;
        } else {
            d2 = y.d(R.dimen.wl);
        }
        bVar.f22381h = d2;
        if (this.f20776b) {
            i5 = (ap.a(getContext()) * 480) / 375;
        }
        bVar.f22382i = i5;
        return bVar;
    }

    static final class d extends m implements h.f.a.b<Integer, z> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(12310);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(a aVar) {
            super(1);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Integer num) {
            int intValue = num.intValue();
            DataChannel dataChannel = this.this$0.p;
            if (dataChannel != null) {
                dataChannel.a(f.class, (Object) true);
            }
            this.this$0.a(intValue, true);
            return z.f158842a;
        }
    }

    @Override // androidx.fragment.app.d, com.bytedance.android.livesdk.v, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int value;
        Integer num;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f20777c = arguments.getLong("arg_anchor_id");
            this.f20778d = arguments.getLong("arg_room_id");
            this.f20780f = arguments.getInt("first_show_rank_type");
            ArrayList<Integer> integerArrayList = arguments.getIntegerArrayList("rank_types");
            if (integerArrayList == null) {
                integerArrayList = (ArrayList) n.c(Integer.valueOf(j.HOURLY_RANK.getType()));
            }
            this.f20779e = integerArrayList;
        }
        DataChannel dataChannel = this.p;
        if (dataChannel != null) {
            dataChannel.a((androidx.lifecycle.m) this, h.class, (h.f.a.b) new d(this));
        }
        DataChannel dataChannel2 = this.p;
        if (dataChannel2 == null || (num = (Integer) dataChannel2.b(h.class)) == null) {
            value = com.bytedance.android.livesdk.rank.impl.api.model.d.UNKNOWN.getValue();
        } else {
            value = num.intValue();
        }
        a(value, false);
        DataChannel dataChannel3 = this.p;
        if (dataChannel3 != null) {
            dataChannel3.a(f.class, (Object) false);
        }
    }

    public final void a(int i2, boolean z) {
        b bVar;
        boolean z2;
        if (i2 == com.bytedance.android.livesdk.rank.impl.api.model.d.ANCHOR.getValue()) {
            if (this.f20782h == null) {
                long j2 = this.f20777c;
                long j3 = this.f20778d;
                ArrayList<Integer> arrayList = this.f20779e;
                if (arrayList == null) {
                    l.a("mRankTypes");
                }
                this.f20782h = b.a.a(j2, j3, arrayList, this.f20780f, i2, new b(this));
            }
            bVar = this.f20782h;
        } else {
            if (this.f20781g == null) {
                long j4 = this.f20777c;
                long j5 = this.f20778d;
                ArrayList<Integer> arrayList2 = this.f20779e;
                if (arrayList2 == null) {
                    l.a("mRankTypes");
                }
                this.f20781g = b.a.a(j4, j5, arrayList2, this.f20780f, i2, new c(this));
            }
            bVar = this.f20781g;
        }
        if (bVar == null) {
            l.b();
        }
        this.f20783i = bVar;
        if (i2 == com.bytedance.android.livesdk.rank.impl.api.model.d.ANCHOR.getValue()) {
            z2 = true;
        } else {
            z2 = false;
        }
        androidx.fragment.app.n a2 = getChildFragmentManager().a();
        if (z) {
            if (z2) {
                a2.a(R.anim.er, R.anim.en);
            } else {
                a2.a(R.anim.em, R.anim.es);
            }
        }
        Fragment fragment = this.f20783i;
        if (fragment != null) {
            a2.b(R.id.b94, fragment).b();
        }
    }
}
