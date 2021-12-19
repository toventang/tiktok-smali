package com.bytedance.android.live.publicscreen.impl.widget.b;

import android.graphics.Bitmap;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.publicscreen.a.d.k;
import com.bytedance.android.live.publicscreen.a.g;
import com.bytedance.android.live.publicscreen.impl.model.e;
import com.bytedance.android.livesdk.ab.b;
import com.bytedance.android.livesdk.event.UserProfileEvent;
import com.bytedance.android.livesdk.model.message.az;
import com.bytedance.android.livesdk.model.message.j;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.m.p;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public final class c<MODEL extends k<? extends com.bytedance.android.livesdk.ac.b.a>> extends com.bytedance.android.live.publicscreen.a.f.b<MODEL> implements k.a {

    /* renamed from: a  reason: collision with root package name */
    public final TextView f12551a;

    /* renamed from: d  reason: collision with root package name */
    public CharSequence f12552d;

    /* renamed from: e  reason: collision with root package name */
    private final HSImageView f12553e;

    /* renamed from: f  reason: collision with root package name */
    private Spannable f12554f;

    static {
        Covode.recordClassIndex(6904);
    }

    public static final class b implements k.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f12557a;

        static {
            Covode.recordClassIndex(6907);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        b(c cVar) {
            this.f12557a = cVar;
        }

        @Override // com.bytedance.android.live.publicscreen.a.d.k.b
        public final void a(Spannable spannable) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f12557a.f12551a.getText());
            spannableStringBuilder.append((CharSequence) " ");
            spannableStringBuilder.append((CharSequence) spannable);
            this.f12557a.f12551a.setText(spannableStringBuilder);
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(this.f12557a.f12552d);
            spannableStringBuilder2.append((CharSequence) " ");
            this.f12557a.f12552d = spannableStringBuilder2.append((CharSequence) spannable);
        }
    }

    static final class a implements View.OnLongClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f12556a;

        static {
            Covode.recordClassIndex(6906);
        }

        a(c cVar) {
            this.f12556a = cVar;
        }

        public final boolean onLongClick(View view) {
            g gVar = this.f12556a.f12195b;
            if (gVar == null) {
                return true;
            }
            gVar.a((k) this.f12556a.f12196c, "report_user");
            return true;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(View view) {
        super(view);
        l.d(view, "");
        View findViewById = view.findViewById(R.id.text);
        l.b(findViewById, "");
        TextView textView = (TextView) findViewById;
        this.f12551a = textView;
        View findViewById2 = view.findViewById(R.id.bjj);
        l.b(findViewById2, "");
        HSImageView hSImageView = (HSImageView) findViewById2;
        this.f12553e = hSImageView;
        hSImageView.setOnClickListener(new View.OnClickListener(this) {
            /* class com.bytedance.android.live.publicscreen.impl.widget.b.c.AnonymousClass1 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ c f12555a;

            static {
                Covode.recordClassIndex(6905);
            }

            {
                this.f12555a = r1;
            }

            public final void onClick(View view) {
                User b2;
                k kVar = (k) this.f12555a.f12196c;
                if (kVar != null && kVar.f12190d.L == com.bytedance.android.livesdk.model.message.a.a.MEMBER) {
                    MESSAGE message = kVar.f12190d;
                    Objects.requireNonNull(message, "null cannot be cast to non-null type com.bytedance.android.livesdk.model.message.MemberMessage");
                    az azVar = (az) message;
                    if (azVar.s != null) {
                        com.bytedance.android.livesdk.model.message.c.b bVar = azVar.s;
                        l.b(bVar, "");
                        if (l.a((Object) "pm_mt_guidance_interaction", (Object) bVar.f19421a)) {
                            HashMap hashMap = new HashMap();
                            hashMap.put("event_type", "click");
                            hashMap.put("click_module", "head");
                            b.a.a("livesdk_anchor_interact_notice").a().a((Map<String, String>) hashMap).b();
                        }
                    }
                }
                k kVar2 = (k) this.f12555a.f12196c;
                if (kVar2 != null && (b2 = kVar2.b()) != null) {
                    UserProfileEvent userProfileEvent = new UserProfileEvent(b2.getId(), "head");
                    userProfileEvent.mSource = "live_comment";
                    userProfileEvent.mReportType = "report_user";
                    com.bytedance.android.livesdk.an.a.a().a(userProfileEvent);
                }
            }
        });
        if (d.f12558a == null) {
            d.f12558a = new d();
        }
        textView.setMovementMethod(d.f12558a);
        textView.setOnLongClickListener(new a(this));
    }

    @Override // com.bytedance.android.live.publicscreen.a.d.k.a
    public final void a(Bitmap bitmap, k<? extends com.bytedance.android.livesdk.ac.b.a> kVar) {
        if (bitmap != null && kVar != null) {
            int a2 = p.a((CharSequence) String.valueOf(this.f12552d), " . ");
            if (a2 != -1) {
                CharSequence charSequence = this.f12552d;
                if (!(charSequence instanceof Spannable)) {
                    charSequence = null;
                }
                Spannable spannable = (Spannable) charSequence;
                if (spannable != null) {
                    com.bytedance.android.livesdk.chatroom.f.c.a(spannable, bitmap, a2 + 1, a2 + 2, kVar);
                }
            }
            Spannable spannable2 = this.f12554f;
            if (spannable2 != null) {
                int a3 = p.a((CharSequence) String.valueOf(spannable2), " . ");
                if (a3 != -1) {
                    com.bytedance.android.livesdk.chatroom.f.c.a(this.f12554f, bitmap, a3 + 1, a3 + 2, kVar);
                }
                this.f12551a.setText(this.f12554f);
                return;
            }
            this.f12551a.setText(this.f12552d);
        }
    }

    /* access modifiers changed from: private */
    public void a(g gVar, MODEL model) {
        l.d(gVar, "");
        l.d(model, "");
        gVar.a(this.f12551a);
        this.f12551a.setTag(R.id.esv, model.f12190d);
        ImageModel J = model.J();
        if (J != null) {
            com.bytedance.android.live.core.f.k.a(this.f12553e, J);
        } else {
            this.f12553e.setImageResource(model.h_());
        }
        this.f12554f = null;
        CharSequence z = model.z();
        if (z != null) {
            this.f12552d = z;
            this.f12551a.setText(z);
            if (model instanceof e) {
                ((e) model).a(this);
            }
            if (model instanceof com.bytedance.android.live.publicscreen.impl.model.b) {
                com.bytedance.android.live.publicscreen.impl.model.b bVar = (com.bytedance.android.live.publicscreen.impl.model.b) model;
                if (((j) bVar.f12190d).f19638h != null && !com.bytedance.common.utility.collection.b.a((Collection) ((j) bVar.f12190d).f19638h.getUrls()) && !TextUtils.isEmpty(((j) bVar.f12190d).f19638h.getUrls().get(0))) {
                    TextView textView = this.f12551a;
                    ((com.bytedance.android.livesdkapi.host.e) com.bytedance.android.live.t.a.a(com.bytedance.android.livesdkapi.host.e.class)).a(((j) bVar.f12190d).f19638h, 
                    /*  JADX ERROR: Method code generation error
                        jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x00ac: INVOKE  
                          (wrap: com.bytedance.android.livesdkapi.host.e : 0x009f: CHECK_CAST (r1v6 com.bytedance.android.livesdkapi.host.e) = (com.bytedance.android.livesdkapi.host.e) (wrap: com.bytedance.android.live.base.a : 0x009b: INVOKE  (r1v5 com.bytedance.android.live.base.a) = (wrap: java.lang.Class : 0x0099: CONST_CLASS   com.bytedance.android.livesdkapi.host.e.class) type: STATIC call: com.bytedance.android.live.t.a.a(java.lang.Class):com.bytedance.android.live.base.a))
                          (wrap: com.bytedance.android.live.base.model.ImageModel : 0x00a5: IGET  (r0v30 com.bytedance.android.live.base.model.ImageModel) = 
                          (wrap: com.bytedance.android.livesdk.model.message.j : 0x00a3: CHECK_CAST (r0v29 com.bytedance.android.livesdk.model.message.j) = (com.bytedance.android.livesdk.model.message.j) (wrap: MESSAGE extends com.bytedance.android.livesdk.ac.b.a : 0x00a1: IGET  (r0v28 MESSAGE extends com.bytedance.android.livesdk.ac.b.a) = (r3v1 'bVar' com.bytedance.android.live.publicscreen.impl.model.b) com.bytedance.android.live.publicscreen.a.d.k.d com.bytedance.android.livesdk.ac.b.a))
                         com.bytedance.android.livesdk.model.message.j.h com.bytedance.android.live.base.model.ImageModel)
                          (wrap: com.bytedance.android.live.publicscreen.impl.model.b$1 : 0x00a9: CONSTRUCTOR  (r2v1 com.bytedance.android.live.publicscreen.impl.model.b$1) = 
                          (r3v1 'bVar' com.bytedance.android.live.publicscreen.impl.model.b)
                          (wrap: java.lang.ref.WeakReference : 0x0089: CONSTRUCTOR  (r4v0 java.lang.ref.WeakReference) = (r0v23 'textView' android.widget.TextView) call: java.lang.ref.WeakReference.<init>(java.lang.Object):void type: CONSTRUCTOR)
                          (wrap: float : 0x0098: ARITH  (r5v1 float) = (wrap: float : 0x0094: IGET  (r5v0 float) = 
                          (wrap: android.util.DisplayMetrics : 0x0090: INVOKE  (r0v25 android.util.DisplayMetrics) = 
                          (wrap: android.content.res.Resources : 0x008c: INVOKE  (r0v24 android.content.res.Resources) = (r0v23 'textView' android.widget.TextView) type: VIRTUAL call: android.widget.TextView.getResources():android.content.res.Resources)
                         type: VIRTUAL call: android.content.res.Resources.getDisplayMetrics():android.util.DisplayMetrics)
                         android.util.DisplayMetrics.density float) / (3.0f float))
                          (wrap: com.bytedance.android.livesdkapi.depend.model.live.Room : 0x0080: IGET  (r6v0 com.bytedance.android.livesdkapi.depend.model.live.Room) = (r9v0 'gVar' com.bytedance.android.live.publicscreen.a.g) com.bytedance.android.live.publicscreen.a.g.j com.bytedance.android.livesdkapi.depend.model.live.Room)
                          (wrap: com.bytedance.android.live.publicscreen.impl.widget.b.c$b : 0x0084: CONSTRUCTOR  (r7v0 com.bytedance.android.live.publicscreen.impl.widget.b.c$b) = 
                          (r8v0 'this' com.bytedance.android.live.publicscreen.impl.widget.b.c<MODEL extends com.bytedance.android.live.publicscreen.a.d.k<? extends com.bytedance.android.livesdk.ac.b.a>> A[IMMUTABLE_TYPE, THIS])
                         call: com.bytedance.android.live.publicscreen.impl.widget.b.c.b.<init>(com.bytedance.android.live.publicscreen.impl.widget.b.c):void type: CONSTRUCTOR)
                         call: com.bytedance.android.live.publicscreen.impl.model.b.1.<init>(com.bytedance.android.live.publicscreen.impl.model.b, java.lang.ref.WeakReference, float, com.bytedance.android.livesdkapi.depend.model.live.Room, com.bytedance.android.live.publicscreen.a.d.k$b):void type: CONSTRUCTOR)
                         type: INTERFACE call: com.bytedance.android.livesdkapi.host.e.a(com.bytedance.android.live.base.model.ImageModel, com.bytedance.android.livesdkapi.host.e$b):com.bytedance.android.livesdkapi.host.e$a in method: com.bytedance.android.live.publicscreen.impl.widget.b.c.a(com.bytedance.android.live.publicscreen.a.g, MODEL extends com.bytedance.android.live.publicscreen.a.d.k<? extends com.bytedance.android.livesdk.ac.b.a>):void, file: classes6.dex
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:217)
                        	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:110)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:56)
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
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:143)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
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
                        Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x00a9: CONSTRUCTOR  (r2v1 com.bytedance.android.live.publicscreen.impl.model.b$1) = 
                          (r3v1 'bVar' com.bytedance.android.live.publicscreen.impl.model.b)
                          (wrap: java.lang.ref.WeakReference : 0x0089: CONSTRUCTOR  (r4v0 java.lang.ref.WeakReference) = (r0v23 'textView' android.widget.TextView) call: java.lang.ref.WeakReference.<init>(java.lang.Object):void type: CONSTRUCTOR)
                          (wrap: float : 0x0098: ARITH  (r5v1 float) = (wrap: float : 0x0094: IGET  (r5v0 float) = 
                          (wrap: android.util.DisplayMetrics : 0x0090: INVOKE  (r0v25 android.util.DisplayMetrics) = 
                          (wrap: android.content.res.Resources : 0x008c: INVOKE  (r0v24 android.content.res.Resources) = (r0v23 'textView' android.widget.TextView) type: VIRTUAL call: android.widget.TextView.getResources():android.content.res.Resources)
                         type: VIRTUAL call: android.content.res.Resources.getDisplayMetrics():android.util.DisplayMetrics)
                         android.util.DisplayMetrics.density float) / (3.0f float))
                          (wrap: com.bytedance.android.livesdkapi.depend.model.live.Room : 0x0080: IGET  (r6v0 com.bytedance.android.livesdkapi.depend.model.live.Room) = (r9v0 'gVar' com.bytedance.android.live.publicscreen.a.g) com.bytedance.android.live.publicscreen.a.g.j com.bytedance.android.livesdkapi.depend.model.live.Room)
                          (wrap: com.bytedance.android.live.publicscreen.impl.widget.b.c$b : 0x0084: CONSTRUCTOR  (r7v0 com.bytedance.android.live.publicscreen.impl.widget.b.c$b) = 
                          (r8v0 'this' com.bytedance.android.live.publicscreen.impl.widget.b.c<MODEL extends com.bytedance.android.live.publicscreen.a.d.k<? extends com.bytedance.android.livesdk.ac.b.a>> A[IMMUTABLE_TYPE, THIS])
                         call: com.bytedance.android.live.publicscreen.impl.widget.b.c.b.<init>(com.bytedance.android.live.publicscreen.impl.widget.b.c):void type: CONSTRUCTOR)
                         call: com.bytedance.android.live.publicscreen.impl.model.b.1.<init>(com.bytedance.android.live.publicscreen.impl.model.b, java.lang.ref.WeakReference, float, com.bytedance.android.livesdkapi.depend.model.live.Room, com.bytedance.android.live.publicscreen.a.d.k$b):void type: CONSTRUCTOR in method: com.bytedance.android.live.publicscreen.impl.widget.b.c.a(com.bytedance.android.live.publicscreen.a.g, MODEL extends com.bytedance.android.live.publicscreen.a.d.k<? extends com.bytedance.android.livesdk.ac.b.a>):void, file: classes6.dex
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                        	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                        	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
                        	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                        	... 35 more
                        Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.bytedance.android.live.publicscreen.impl.model.b, state: GENERATED_AND_UNLOADED
                        	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                        	... 41 more
                        */
                    /*
                    // Method dump skipped, instructions count: 176
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.publicscreen.impl.widget.b.c.a(com.bytedance.android.live.publicscreen.a.g, com.bytedance.android.live.publicscreen.a.d.k):void");
                }
            }
