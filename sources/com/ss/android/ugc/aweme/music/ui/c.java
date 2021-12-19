package com.ss.android.ugc.aweme.music.ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.assem.arch.core.Assembler;
import com.bytedance.assem.arch.core.i;
import com.bytedance.assem.arch.core.q;
import com.bytedance.assem.arch.extensions.d;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerlist.PowerList;
import com.ss.android.ugc.aweme.music.model.ExternalMusicInfo;
import com.zhiliaoapp.musically.R;
import h.f.b.ab;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

public final class c extends com.bytedance.ies.foundation.fragment.a {

    /* renamed from: j  reason: collision with root package name */
    public static final a f111936j = new a((byte) 0);

    /* renamed from: e  reason: collision with root package name */
    public List<ExternalMusicInfo> f111937e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f111938f;

    /* renamed from: g  reason: collision with root package name */
    public String f111939g;

    /* renamed from: h  reason: collision with root package name */
    public String f111940h;

    /* renamed from: i  reason: collision with root package name */
    public String f111941i;

    /* renamed from: k  reason: collision with root package name */
    private HashMap f111942k;

    static {
        Covode.recordClassIndex(71946);
    }

    @Override // com.bytedance.ies.foundation.fragment.a
    public final View a(int i2) {
        if (this.f111942k == null) {
            this.f111942k = new HashMap();
        }
        View view = (View) this.f111942k.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.f111942k.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    @Override // com.bytedance.ies.foundation.fragment.a
    public final void br_() {
        HashMap hashMap = this.f111942k;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.a, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        br_();
    }

    public static final class a {
        static {
            Covode.recordClassIndex(71947);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class b extends m implements h.f.a.b<Assembler, z> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(71948);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(c cVar) {
            super(1);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Assembler assembler) {
            Assembler assembler2 = assembler;
            l.d(assembler2, "");
            assembler2.a(this.this$0, (h.f.a.b<? super i<com.bytedance.assem.arch.extensions.c>, z>) new h.f.a.b<i<com.bytedance.assem.arch.extensions.c>, z>(this) {
                /* class com.ss.android.ugc.aweme.music.ui.c.b.AnonymousClass1 */
                final /* synthetic */ b this$0;

                static {
                    Covode.recordClassIndex(71949);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ z invoke(i<com.bytedance.assem.arch.extensions.c> iVar) {
                    i<com.bytedance.assem.arch.extensions.c> iVar2 = iVar;
                    l.d(iVar2, "");
                    List<ExternalMusicInfo> list = this.this$0.this$0.f111937e;
                    if (list == null) {
                        l.a("mMusicInfoList");
                    }
                    boolean z = this.this$0.this$0.f111938f;
                    String str = this.this$0.this$0.f111939g;
                    if (str == null) {
                        l.a("processId");
                    }
                    String str2 = this.this$0.this$0.f111940h;
                    if (str2 == null) {
                        l.a("musicId");
                    }
                    String str3 = this.this$0.this$0.f111941i;
                    if (str3 == null) {
                        l.a("groupId");
                    }
                    iVar2.a(new b(list, z, str, str2, str3));
                    iVar2.f25573b = "music_info";
                    return z.f158842a;
                }
            });
            assembler2.b(this.this$0, new h.f.a.b<q, z>(this) {
                /* class com.ss.android.ugc.aweme.music.ui.c.b.AnonymousClass2 */
                final /* synthetic */ b this$0;

                static {
                    Covode.recordClassIndex(71950);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ z invoke(q qVar) {
                    q qVar2 = qVar;
                    l.d(qVar2, "");
                    qVar2.a(ab.a(com.ss.android.ugc.aweme.music.ui.widget.a.class));
                    qVar2.f25596b = new com.ss.android.ugc.aweme.music.ui.widget.a();
                    qVar2.f25599e = (PowerList) this.this$0.this$0.a(R.id.drk);
                    return z.f158842a;
                }
            });
            return z.f158842a;
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.a, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        Serializable serializable;
        boolean z;
        String str;
        String str2;
        String string;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            serializable = arguments.getSerializable("music_info_list");
        } else {
            serializable = null;
        }
        Objects.requireNonNull(serializable, "null cannot be cast to non-null type kotlin.collections.ArrayList<com.ss.android.ugc.aweme.music.model.ExternalMusicInfo> /* = java.util.ArrayList<com.ss.android.ugc.aweme.music.model.ExternalMusicInfo> */");
        this.f111937e = (ArrayList) serializable;
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            z = arguments2.getBoolean("is_exclusive_resso");
        } else {
            z = false;
        }
        this.f111938f = z;
        Bundle arguments3 = getArguments();
        String str3 = "";
        if (arguments3 == null || (str = arguments3.getString("process_id")) == null) {
            str = str3;
        }
        this.f111939g = str;
        Bundle arguments4 = getArguments();
        if (arguments4 == null || (str2 = arguments4.getString("music_id")) == null) {
            str2 = str3;
        }
        this.f111940h = str2;
        Bundle arguments5 = getArguments();
        if (!(arguments5 == null || (string = arguments5.getString("group_id")) == null)) {
            str3 = string;
        }
        this.f111941i = str3;
    }

    @Override // com.bytedance.ies.foundation.fragment.a, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        l.d(view, "");
        super.onViewCreated(view, bundle);
        d.a(this, new b(this));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        l.d(layoutInflater, "");
        return com.ss.android.ugc.aweme.d.b.a(getActivity(), R.layout.alp, layoutInflater, viewGroup);
    }
}
