package com.bytedance.android.livesdk.ad;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import com.bytedance.android.live.design.widget.LiveEditText;
import com.bytedance.android.livesdk.at.f;
import com.bytedance.android.livesdk.j.df;
import com.bytedance.android.livesdk.j.q;
import com.bytedance.android.livesdk.j.r;
import com.bytedance.android.livesdk.j.s;
import com.bytedance.android.livesdk.userservice.u;
import com.bytedance.android.livesdk.utils.p;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import h.a.n;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

public final class g extends com.bytedance.android.livesdk.ui.a {

    /* renamed from: a  reason: collision with root package name */
    public b f13672a;

    /* renamed from: b  reason: collision with root package name */
    private HashMap f13673b;

    static {
        Covode.recordClassIndex(7577);
    }

    public final View a(int i2) {
        if (this.f13673b == null) {
            this.f13673b = new HashMap();
        }
        View view = (View) this.f13673b.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.f13673b.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    @Override // com.bytedance.android.livesdk.ui.a, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        HashMap hashMap = this.f13673b;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    private final long a() {
        Room room;
        if (p.c()) {
            f b2 = u.a().b();
            l.b(b2, "");
            return b2.c();
        }
        DataChannel a2 = com.bytedance.ies.sdk.datachannel.f.a(this);
        if (a2 == null || (room = (Room) a2.b(df.class)) == null) {
            return 0;
        }
        return room.getOwnerUserId();
    }

    public static final class d implements TextWatcher {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f13676a;

        static {
            Covode.recordClassIndex(7581);
        }

        public final void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        }

        public final void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        d(g gVar) {
            this.f13676a = gVar;
        }

        public final void afterTextChanged(Editable editable) {
            String str;
            g gVar = this.f13676a;
            b bVar = gVar.f13672a;
            if (bVar != null) {
                LiveEditText liveEditText = (LiveEditText) gVar.a(R.id.duo);
                l.b(liveEditText, "");
                Editable text = liveEditText.getText();
                if (text == null || (str = text.toString()) == null) {
                    str = "";
                }
                l.d(str, "");
                List<com.bytedance.android.live.s.a.a> list = bVar.f13649b;
                ArrayList arrayList = new ArrayList();
                for (T t : list) {
                    T t2 = t;
                    String str2 = t2.f12595c;
                    Boolean bool = null;
                    if (!p.a(str2 != null ? Boolean.valueOf(h.m.p.a((CharSequence) str2, (CharSequence) str, true)) : null)) {
                        String str3 = t2.f12596d;
                        if (str3 != null) {
                            bool = Boolean.valueOf(h.m.p.a((CharSequence) str3, (CharSequence) str, true));
                        }
                        if (!p.a(bool)) {
                        }
                    }
                    arrayList.add(t);
                }
                bVar.f13648a = n.g((Collection) arrayList);
                bVar.notifyDataSetChanged();
                h.f.a.b<? super Boolean, z> bVar2 = bVar.f13650c;
                if (bVar2 != null) {
                    bVar2.invoke(Boolean.valueOf(bVar.f13648a.isEmpty()));
                }
            }
            LiveEditText liveEditText2 = (LiveEditText) this.f13676a.a(R.id.duo);
            l.b(liveEditText2, "");
            if (p.a(liveEditText2.getText())) {
                p.b(this.f13676a.a(R.id.dv5));
            } else {
                p.a(this.f13676a.a(R.id.dv5));
            }
        }
    }

    static final class b<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f13674a;

        static {
            Covode.recordClassIndex(7579);
        }

        b(g gVar) {
            this.f13674a = gVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            b bVar = this.f13674a.f13672a;
            if (bVar != null) {
                bVar.notifyDataSetChanged();
            }
        }
    }

    static final class c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f13675a;

        static {
            Covode.recordClassIndex(7580);
        }

        c(g gVar) {
            this.f13675a = gVar;
        }

        public final void onClick(View view) {
            LiveEditText liveEditText = (LiveEditText) this.f13675a.a(R.id.duo);
            l.b(liveEditText, "");
            Editable text = liveEditText.getText();
            if (text != null) {
                text.clear();
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater cloneInContext = super.onGetLayoutInflater(bundle).cloneInContext(com.bytedance.android.live.design.a.a.a(getActivity()));
        l.b(cloneInContext, "");
        return cloneInContext;
    }

    static final class a extends m implements h.f.a.b<Boolean, z> {
        final /* synthetic */ List $adminUsers$inlined;
        final /* synthetic */ g this$0;

        static {
            Covode.recordClassIndex(7578);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(g gVar, List list) {
            super(1);
            this.this$0 = gVar;
            this.$adminUsers$inlined = list;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Boolean bool) {
            boolean booleanValue = bool.booleanValue();
            p.a(this.this$0.a(R.id.ezu), !booleanValue);
            p.a(this.this$0.a(R.id.dvk), !booleanValue);
            p.a(this.this$0.a(R.id.duq), booleanValue);
            return z.f158842a;
        }
    }

    static final class e implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f13677a;

        static {
            Covode.recordClassIndex(7582);
        }

        e(g gVar) {
            this.f13677a = gVar;
        }

        public final void onClick(View view) {
            LiveEditText liveEditText = (LiveEditText) this.f13677a.a(R.id.duo);
            l.b(liveEditText, "");
            p.b((EditText) liveEditText);
            DataChannel a2 = com.bytedance.ies.sdk.datachannel.f.a(this.f13677a);
            if (a2 != null) {
                a2.b(r.class, s.a(q.MODERATOR_LIST));
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x004f, code lost:
        if (r3 == null) goto L_0x008a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0051, code lost:
        r3 = (java.util.List) r3.b(com.bytedance.android.livesdk.ad.h.class);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0059, code lost:
        if (r3 == null) goto L_0x008a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x005b, code lost:
        r4 = new java.util.ArrayList(h.a.n.a((java.lang.Iterable) r3, 10));
        r3 = r3.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x006c, code lost:
        if (r3.hasNext() == false) goto L_0x0087;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x006e, code lost:
        r4.add(java.lang.Long.valueOf(((com.bytedance.android.live.s.a.a) r3.next()).f12593a));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0087, code lost:
        r4 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x008a, code lost:
        r4 = h.a.z.INSTANCE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x008c, code lost:
        r1 = new java.util.ArrayList(h.a.n.a((java.lang.Iterable) r7, 10));
        r6 = r7.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x009d, code lost:
        if (r6.hasNext() == false) goto L_0x00ce;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x009f, code lost:
        r5 = r6.next();
        r15 = h.a.n.a(r4, r5.f23287a);
        h.f.b.l.d(r5, "");
        r3 = r5.f23287a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00b2, code lost:
        if (r3 == null) goto L_0x00cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00b4, code lost:
        r8 = r3.longValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00b8, code lost:
        r10 = r5.f23288b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00ba, code lost:
        if (r10 != null) goto L_0x00bd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00bc, code lost:
        r10 = "";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00bd, code lost:
        r1.add(new com.bytedance.android.live.s.a.a(r8, r10, r5.f23289c, r5.f23290d, r5.f23291e, null, r15));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00cb, code lost:
        r8 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00ce, code lost:
        r1 = r1;
        r7 = a();
        r4 = com.bytedance.ies.sdk.datachannel.f.a(r16);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00db, code lost:
        if (r4 == null) goto L_0x016f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00dd, code lost:
        r3 = (java.lang.Long) r4.b(com.bytedance.android.livesdk.j.di.class);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00e5, code lost:
        if (r3 != null) goto L_0x00ea;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00e7, code lost:
        h.f.b.l.b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00ea, code lost:
        r5 = new com.bytedance.android.livesdk.ad.b("friend_panel", r7, true, r3.longValue());
        r5.a(r1);
        r3 = new com.bytedance.android.livesdk.ad.g.a(r16, r1);
        h.f.b.l.d(r3, "");
        r5.f13650c = r3;
        r16.f13672a = r5;
        register(com.bytedance.android.livesdk.an.a.a().a(com.bytedance.android.livesdk.ad.f.class).d(new com.bytedance.android.livesdk.ad.g.b(r16)));
        com.bytedance.android.livesdk.utils.p.b(a(com.zhiliaoapp.musically.R.id.dvk));
        com.bytedance.android.livesdk.utils.p.b(a(com.zhiliaoapp.musically.R.id.ezu));
        com.bytedance.android.livesdk.utils.p.b(a(com.zhiliaoapp.musically.R.id.duy));
        r2 = (androidx.recyclerview.widget.RecyclerView) a(com.zhiliaoapp.musically.R.id.dvk);
        r2.setAdapter(r16.f13672a);
        r2.getContext();
        r2.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager());
        ((android.widget.ImageView) a(com.zhiliaoapp.musically.R.id.dv5)).setOnClickListener(new com.bytedance.android.livesdk.ad.g.c(r16));
        ((com.bytedance.android.live.design.widget.LiveEditText) a(com.zhiliaoapp.musically.R.id.duo)).addTextChangedListener(new com.bytedance.android.livesdk.ad.g.d(r16));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x016f, code lost:
        r3 = null;
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0172 A[EDGE_INSN: B:47:0x0172->B:42:0x0172 ?: BREAK  , SYNTHETIC] */
    @Override // com.bytedance.android.livesdk.ui.a, androidx.fragment.app.Fragment
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onViewCreated(android.view.View r17, android.os.Bundle r18) {
        /*
        // Method dump skipped, instructions count: 398
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.ad.g.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        l.d(layoutInflater, "");
        return com.a.a(layoutInflater, R.layout.b60, viewGroup, false);
    }
}
