package com.ss.android.ugc.aweme.shortvideo;

import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ad;
import androidx.lifecycle.ae;
import com.bytedance.common.utility.h;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tux.g.b;
import com.google.c.c.ap;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.ba.e;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import com.ss.android.ugc.aweme.port.in.c;
import com.ss.android.ugc.aweme.port.in.i;
import com.ss.android.ugc.aweme.port.in.l;
import com.ss.android.ugc.aweme.shortvideo.ae.g;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.eventtrack.HashTagMobHelper;
import com.ss.android.ugc.aweme.shortvideo.model.AVTextExtraStruct;
import com.ss.android.ugc.aweme.shortvideo.publish.aj;
import com.ss.android.ugc.aweme.shortvideo.util.as;
import com.ss.android.ugc.aweme.shortvideo.view.HashTagMentionEditText;
import com.ss.android.ugc.aweme.shortvideo.view.MentionEditText;
import com.ss.android.ugc.aweme.shortvideo.view.o;
import com.ss.android.ugc.aweme.utils.dj;
import com.ss.android.ugc.aweme.video.hashtag.a;
import com.ss.android.ugc.aweme.video.hashtag.helper.BaseTitleHelper;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class eh {

    /* renamed from: a  reason: collision with root package name */
    public static final String f128417a = eh.class.getSimpleName();

    /* renamed from: b  reason: collision with root package name */
    public final Fragment f128418b;

    /* renamed from: c  reason: collision with root package name */
    public final HashTagMentionEditText f128419c;

    /* renamed from: d  reason: collision with root package name */
    final View f128420d;

    /* renamed from: e  reason: collision with root package name */
    final View f128421e;

    /* renamed from: f  reason: collision with root package name */
    final View f128422f;

    /* renamed from: g  reason: collision with root package name */
    public ViewGroup f128423g;

    /* renamed from: h  reason: collision with root package name */
    final int f128424h;

    /* renamed from: i  reason: collision with root package name */
    final int f128425i;

    /* renamed from: j  reason: collision with root package name */
    public String f128426j = "";

    /* renamed from: k  reason: collision with root package name */
    public int f128427k;

    /* renamed from: l  reason: collision with root package name */
    BaseTitleHelper f128428l;

    /* renamed from: m  reason: collision with root package name */
    HashTagMobHelper f128429m;
    public String n;
    public boolean o;
    public aj p;
    public String q;
    public final VideoPublishEditModel r;
    public boolean s = false;
    public int t = -1;
    public boolean u = false;
    public e v;
    public final ArrayList<bz> w = new ArrayList<>();
    private final int x = as.a();
    private final String y = "publish_add_video";

    static {
        Covode.recordClassIndex(84211);
    }

    public static boolean b() {
        return l.f115658a.e().d();
    }

    public final void c() {
        if (this.f128419c.s) {
            if (this.f128419c.y) {
                this.f128419c.setShouldDisableTrim(false);
            } else {
                this.f128419c.setHasUrlTransforming(false);
                this.f128419c.getText().delete(this.f128419c.getUrlStart(), this.f128419c.getUrlEnd());
                HashTagMentionEditText hashTagMentionEditText = this.f128419c;
                hashTagMentionEditText.setUrlEnd(hashTagMentionEditText.getUrlStart());
                this.f128419c.setTransformingUrlRemoved(true);
            }
        }
        HashTagMentionEditText hashTagMentionEditText2 = this.f128419c;
        Editable text = hashTagMentionEditText2.getText();
        String obj = text.toString();
        int length = obj.length();
        int i2 = 0;
        while (i2 < length && obj.charAt(i2) <= ' ') {
            i2++;
        }
        int i3 = length;
        while (i3 > i2 && obj.charAt(i3 - 1) <= ' ') {
            i3--;
        }
        if (i2 < i3) {
            int i4 = i3 + 1;
            if (i4 < length) {
                text.delete(i4, length);
            }
            text.delete(0, i2);
            return;
        }
        hashTagMentionEditText2.setText("");
    }

    public final void a() {
        e eVar = new e();
        this.v = eVar;
        HashTagMentionEditText hashTagMentionEditText = this.f128419c;
        if (hashTagMentionEditText != null) {
            hashTagMentionEditText.addTextChangedListener(
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0010: INVOKE  
                  (r1v0 'hashTagMentionEditText' com.ss.android.ugc.aweme.shortvideo.view.HashTagMentionEditText)
                  (wrap: com.ss.android.ugc.aweme.ba.e$1 : 0x000d: CONSTRUCTOR  (r0v27 com.ss.android.ugc.aweme.ba.e$1) = (r2v0 'eVar' com.ss.android.ugc.aweme.ba.e) call: com.ss.android.ugc.aweme.ba.e.1.<init>(com.ss.android.ugc.aweme.ba.e):void type: CONSTRUCTOR)
                 type: VIRTUAL call: android.widget.EditText.addTextChangedListener(android.text.TextWatcher):void in method: com.ss.android.ugc.aweme.shortvideo.eh.a():void, file: classes5.dex
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
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:244)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:237)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:342)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:295)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:264)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x000d: CONSTRUCTOR  (r0v27 com.ss.android.ugc.aweme.ba.e$1) = (r2v0 'eVar' com.ss.android.ugc.aweme.ba.e) call: com.ss.android.ugc.aweme.ba.e.1.<init>(com.ss.android.ugc.aweme.ba.e):void type: CONSTRUCTOR in method: com.ss.android.ugc.aweme.shortvideo.eh.a():void, file: classes5.dex
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                	... 19 more
                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.ss.android.ugc.aweme.ba.e, state: GENERATED_AND_UNLOADED
                	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                	... 25 more
                */
            /*
            // Method dump skipped, instructions count: 187
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.eh.a():void");
        }

        public final List<AVTextExtraStruct> d() {
            HashTagMentionEditText hashTagMentionEditText = this.f128419c;
            String str = this.q;
            Editable text = hashTagMentionEditText.getText();
            if (text == null || TextUtils.isEmpty(text.toString())) {
                return null;
            }
            o[] oVarArr = (o[]) text.getSpans(0, text.length(), o.class);
            int length = oVarArr.length;
            int[] iArr = new int[length];
            if (oVarArr.length > 0) {
                for (int i2 = 0; i2 < length; i2++) {
                    iArr[i2] = text.getSpanStart(oVarArr[i2]);
                }
                Arrays.sort(iArr);
            }
            ArrayList arrayList = new ArrayList();
            MentionEditText.MentionSpan[] mentionText = hashTagMentionEditText.getMentionText();
            for (MentionEditText.MentionSpan mentionSpan : mentionText) {
                if (mentionSpan.f132605c == 0 || mentionSpan.f132605c == 5) {
                    int spanStart = text.getSpanStart(mentionSpan);
                    int i3 = 0;
                    for (int i4 = 0; i4 < length; i4++) {
                        if (spanStart > iArr[i4]) {
                            i3++;
                        }
                    }
                    mentionSpan.f132606d.setStart(text.getSpanStart(mentionSpan) - i3);
                    mentionSpan.f132606d.setEnd(text.getSpanEnd(mentionSpan) - i3);
                    arrayList.add(mentionSpan.f132606d);
                }
            }
            List<a> b2 = hashTagMentionEditText.b(hashTagMentionEditText.getNoAdTagText());
            for (a aVar : b2) {
                int i5 = aVar.f143394a;
                int i6 = 0;
                for (int i7 = 0; i7 < length; i7++) {
                    if (i5 > iArr[i7]) {
                        i6++;
                    }
                }
                TextExtraStruct textExtraStruct = new TextExtraStruct();
                textExtraStruct.setType(1);
                textExtraStruct.setStarAtlasTag(hashTagMentionEditText.b(b2.indexOf(aVar)));
                textExtraStruct.setHashTagName(aVar.f143396c.replaceAll("#", ""));
                textExtraStruct.setStart(aVar.f143394a - i6);
                textExtraStruct.setEnd(aVar.f143395b - i6);
                arrayList.add(textExtraStruct);
                if (TextUtils.equals(c.u.c(), str)) {
                    c.f115631j.saveLocalHashTag(true, textExtraStruct.getHashTagName());
                }
            }
            return ap.a((Iterable) ap.a(arrayList, new g()));
        }

        public final boolean e() {
            int length;
            String string;
            int a2 = as.a();
            if (TextUtils.isEmpty(this.f128419c.getAdTag())) {
                if (b()) {
                    length = c(this.f128419c.getText().toString());
                } else {
                    length = this.f128419c.getText().length();
                }
            } else if (b()) {
                length = c(this.f128419c.getNoAdTagText());
            } else {
                length = this.f128419c.getNoAdTagText().length();
            }
            if (a2 - length > 0) {
                return false;
            }
            if (com.ss.android.ugc.aweme.shortvideo.k.g.a()) {
                string = i.f115645a.getResources().getString(R.string.fl5, Integer.valueOf(a2));
            } else {
                string = i.f115645a.getResources().getString(R.string.et7, Integer.valueOf(a2));
            }
            new b(this.f128419c).a(string).b();
            return true;
        }

        private static int c(String str) {
            return str.replace("\n", "").length();
        }

        public final void a(int i2) {
            this.f128427k = i2;
            HashTagMentionEditText hashTagMentionEditText = this.f128419c;
            if (hashTagMentionEditText != null) {
                hashTagMentionEditText.setVideoType(i2);
            }
        }

        public final void a(String str) {
            String str2;
            d a2 = new d().a("creation_id", this.f128426j).a("enter_from", "video_post_page").a("enter_method", str);
            VideoPublishEditModel videoPublishEditModel = this.r;
            if (videoPublishEditModel == null) {
                str2 = "";
            } else {
                str2 = videoPublishEditModel.mShootWay;
            }
            r.a("click_caption_return", a2.a("shoot_way", str2).a("content_source", es.a(this.r)).a("content_type", es.c(this.r)).f66730a);
        }

        public final void b(String str) {
            List<AVTextExtraStruct> d2 = d();
            if (!(d2 == null || d2.isEmpty())) {
                Collections.sort(d2, el.f128436a);
                for (AVTextExtraStruct aVTextExtraStruct : d2) {
                    if (aVTextExtraStruct.getType() == 0 && TextUtils.equals(aVTextExtraStruct.getUserId(), str) && this.f128419c.getText() != null) {
                        this.f128419c.getText().replace(aVTextExtraStruct.getStart(), aVTextExtraStruct.getEnd(), "");
                    }
                }
            }
        }

        public final void b(List<String> list) {
            if (!com.bytedance.common.utility.collection.b.a((Collection) list)) {
                for (String str : list) {
                    if (str == null || this.f128419c.getText().toString().contains("#" + str + " ") || this.f128419c.getText().toString().contains("#" + str + this.f128418b.getString(R.string.g2t))) {
                        this.f128419c.C.add("#".concat(String.valueOf(str)));
                    } else {
                        this.f128419c.C.add("#".concat(String.valueOf(str)));
                        a b2 = dj.b(this.f128419c.getText().toString(), str);
                        if (b2.f143395b <= as.a()) {
                            this.f128419c.f132580l = false;
                            this.f128419c.getText().insert(b2.f143394a, b2.f143396c);
                        }
                        this.f128419c.a(true);
                    }
                }
            }
        }

        public final void c(List<AVTextExtraStruct> list) {
            this.f128419c.setAVTextExtraList(list);
            if (!h.a(list)) {
                Iterator<AVTextExtraStruct> it = list.iterator();
                while (it.hasNext()) {
                    String trim = ("#" + it.next().getHashTagName()).trim();
                    if (!dj.a(trim)) {
                        this.f128419c.C.add(trim);
                    }
                }
            }
        }

        public final void a(List<AVChallenge> list) {
            if (!com.bytedance.common.utility.collection.b.a((Collection) list)) {
                for (AVChallenge aVChallenge : list) {
                    if (aVChallenge != null) {
                        this.f128419c.C.add("#" + aVChallenge.challengeName);
                        if (!this.f128419c.getText().toString().contains("#" + aVChallenge.getChallengeName() + " ") && !this.f128419c.getText().toString().contains("#" + aVChallenge.getChallengeName() + this.f128418b.getString(R.string.g2t))) {
                            a b2 = dj.b(this.f128419c.getText().toString(), aVChallenge.getChallengeName());
                            if (b2.f143395b <= as.a()) {
                                this.f128419c.f132580l = false;
                                this.f128419c.getText().insert(b2.f143394a, b2.f143396c);
                            }
                            this.f128419c.a(true);
                        }
                    }
                }
            }
        }

        public final aj a(int i2, boolean z) {
            aj ajVar = null;
            if (z || i2 == 2 || i2 == 1 || (this.f128419c.getText() != null && this.f128419c.getText().toString().isEmpty())) {
                return null;
            }
            if (this.p == null) {
                if (SettingsManager.a().a("allowed_post_prompts", false)) {
                    ajVar = new aj((byte) 0);
                }
                this.p = ajVar;
            }
            return this.p;
        }

        public final boolean a(String str, String str2, String str3) {
            return this.f128419c.a(str, str2, str3);
        }

        public eh(Fragment fragment, HashTagMentionEditText hashTagMentionEditText, View view, View view2, View view3, ViewGroup viewGroup, VideoPublishEditModel videoPublishEditModel) {
            this.f128418b = fragment;
            this.f128419c = hashTagMentionEditText;
            this.f128420d = view;
            this.f128421e = view2;
            this.f128422f = view3;
            this.f128423g = viewGroup;
            this.f128424h = 0;
            this.f128425i = 0;
            this.r = videoPublishEditModel;
            androidx.fragment.app.e activity = fragment.getActivity();
            if (activity != null) {
                this.f128428l = BaseTitleHelper.a.a(activity);
                this.f128429m = (HashTagMobHelper) ae.a(activity, (ad.b) null).a(HashTagMobHelper.class);
            }
            if (videoPublishEditModel != null) {
                hashTagMentionEditText.setVideoPublishEditModel(videoPublishEditModel);
            }
            as.f132231a = 0;
        }
    }
