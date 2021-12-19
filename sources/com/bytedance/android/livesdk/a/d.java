package com.bytedance.android.livesdk.a;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.f.p;
import com.bytedance.android.livesdk.event.UserProfileEvent;
import com.bytedance.common.utility.collection.b;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public final class d extends com.bytedance.android.live.uikit.recyclerview.a {

    /* renamed from: c  reason: collision with root package name */
    public b f13253c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f13254d;

    /* renamed from: e  reason: collision with root package name */
    private Context f13255e;

    /* renamed from: f  reason: collision with root package name */
    private List<User> f13256f = new ArrayList();

    /* renamed from: g  reason: collision with root package name */
    private String f13257g;

    /* renamed from: h  reason: collision with root package name */
    private long f13258h;

    /* renamed from: i  reason: collision with root package name */
    private long f13259i;

    static {
        Covode.recordClassIndex(7383);
    }

    @Override // com.bytedance.android.live.uikit.recyclerview.b
    public final int c() {
        if (this.f13254d) {
            return this.f13256f.size() + 1;
        }
        return this.f13256f.size();
    }

    static class a extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        TextView f13260a;

        static {
            Covode.recordClassIndex(7384);
        }

        public a(View view) {
            super(view);
            this.f13260a = (TextView) view.findViewById(R.id.ew0);
        }
    }

    public final void a(Collection<? extends User> collection) {
        if (collection != null && collection.size() > 0) {
            this.f13256f.addAll(collection);
        }
    }

    @Override // com.bytedance.android.live.uikit.recyclerview.b
    public final int a(int i2) {
        if (!this.f13254d || i2 != this.f13256f.size()) {
            return super.a(i2);
        }
        return 4099;
    }

    public final void a(long j2) {
        for (int size = this.f13256f.size() - 1; size >= 0; size--) {
            User user = this.f13256f.get(size);
            if (user != null && user.getId() == j2) {
                this.f13256f.remove(size);
                notifyDataSetChanged();
                return;
            }
        }
    }

    @Override // com.bytedance.android.live.uikit.recyclerview.b
    public final RecyclerView.ViewHolder a(ViewGroup viewGroup, int i2) {
        if (i2 == 4099) {
            return new a(com.a.a(LayoutInflater.from(this.f13255e), R.layout.b_c, viewGroup, false));
        }
        Context context = this.f13255e;
        return new f(context, com.a.a(LayoutInflater.from(context), R.layout.b_8, viewGroup, false), this.f13257g, this.f13258h, this.f13259i, this.f13253c);
    }

    @Override // com.bytedance.android.live.uikit.recyclerview.b
    public final void a(RecyclerView.ViewHolder viewHolder, int i2) {
        List<User> list;
        ImageModel o;
        int i3;
        if (getItemViewType(i2) == 4099) {
            a aVar = (a) viewHolder;
            if (aVar != null) {
                String str = this.f13257g;
                TextView textView = aVar.f13260a;
                if (str.equals("activity_kick_out")) {
                    i3 = R.string.gon;
                } else {
                    i3 = R.string.gom;
                }
                textView.setText(i3);
                return;
            }
            return;
        }
        f fVar = (f) viewHolder;
        if (fVar != null && (list = this.f13256f) != null) {
            fVar.f13269i = list;
            User user = list.get(i2);
            if (user != null) {
                fVar.f13263c.setVisibility(0);
                if (user.getAvatarThumb() != null) {
                    p.a(fVar.f13261a, user.getAvatarThumb());
                } else {
                    fVar.f13261a.setImageResource(2131234424);
                }
                UserProfileEvent userProfileEvent = new UserProfileEvent(user);
                userProfileEvent.mReportType = "report_user";
                fVar.f13261a.setOnClickListener(new g(userProfileEvent));
                fVar.f13266f.setText(user.getDisplayId());
                fVar.f13265e.setText(user.getNickName());
                if (user.getUserHonor() == null || (o = user.getUserHonor().o()) == null || b.a((Collection) o.getUrls())) {
                    fVar.f13267g.setVisibility(8);
                } else {
                    p.a(fVar.f13267g, o, 0, 
                    /*  JADX ERROR: Method code generation error
                        jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0090: INVOKE  
                          (wrap: com.bytedance.android.live.core.widget.HSImageView : 0x0089: IGET  (r1v9 com.bytedance.android.live.core.widget.HSImageView) = (r6v1 'fVar' com.bytedance.android.livesdk.a.f) com.bytedance.android.livesdk.a.f.g com.bytedance.android.live.core.widget.HSImageView)
                          (r2v1 'o' com.bytedance.android.live.base.model.ImageModel)
                          (0 int)
                          (wrap: com.bytedance.android.livesdk.a.f$1 : 0x008d: CONSTRUCTOR  (r0v18 com.bytedance.android.livesdk.a.f$1) = (r6v1 'fVar' com.bytedance.android.livesdk.a.f) call: com.bytedance.android.livesdk.a.f.1.<init>(com.bytedance.android.livesdk.a.f):void type: CONSTRUCTOR)
                         type: STATIC call: com.bytedance.android.live.core.f.p.a(android.widget.ImageView, com.bytedance.android.live.base.model.ImageModel, int, com.bytedance.android.live.core.f.p$a):void in method: com.bytedance.android.livesdk.a.d.a(androidx.recyclerview.widget.RecyclerView$ViewHolder, int):void, file: classes6.dex
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:217)
                        	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:110)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:56)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:157)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:143)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:143)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                        	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:244)
                        	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:237)
                        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:342)
                        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:295)
                        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:264)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                        Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x008d: CONSTRUCTOR  (r0v18 com.bytedance.android.livesdk.a.f$1) = (r6v1 'fVar' com.bytedance.android.livesdk.a.f) call: com.bytedance.android.livesdk.a.f.1.<init>(com.bytedance.android.livesdk.a.f):void type: CONSTRUCTOR in method: com.bytedance.android.livesdk.a.d.a(androidx.recyclerview.widget.RecyclerView$ViewHolder, int):void, file: classes6.dex
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                        	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                        	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
                        	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                        	... 37 more
                        Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.bytedance.android.livesdk.a.f, state: GENERATED_AND_UNLOADED
                        	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                        	... 43 more
                        */
                    /*
                    // Method dump skipped, instructions count: 198
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.a.d.a(androidx.recyclerview.widget.RecyclerView$ViewHolder, int):void");
                }

                public d(Context context, String str, long j2, long j3) {
                    this.f13255e = context;
                    this.f13257g = str;
                    this.f13258h = j2;
                    this.f13259i = j3;
                }
            }
