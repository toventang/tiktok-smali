package com.ss.android.ugc.aweme.commerce_challenge_impl.service;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.lighten.a.r;
import com.ss.android.ugc.aweme.base.e;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.utils.h;
import com.ss.android.ugc.aweme.base.v;
import com.ss.android.ugc.aweme.commerce_challenge_api.service.ICommerceChallengeService;
import com.ss.android.ugc.aweme.commerce_challenge_impl.c.d;
import com.ss.android.ugc.aweme.commerce_challenge_impl.d.a;
import com.ss.android.ugc.aweme.commerce_challenge_impl.d.c;
import com.ss.android.ugc.aweme.discover.model.Challenge;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import com.ss.android.ugc.aweme.views.MentionTextView;
import com.ss.android.ugc.b;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.z;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Objects;

public final class CommerceChallengeServiceImpl implements ICommerceChallengeService {
    static {
        Covode.recordClassIndex(45278);
    }

    @Override // com.ss.android.ugc.aweme.commerce_challenge_api.service.ICommerceChallengeService
    public final void a(String str) {
        a.a(str);
    }

    @Override // com.ss.android.ugc.aweme.commerce_challenge_api.service.ICommerceChallengeService
    public final boolean a(Context context, String str, boolean z, TextView textView, boolean z2, String str2) {
        l.d(context, "");
        l.d(textView, "");
        l.d(context, "");
        l.d(textView, "");
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        z.e eVar = new z.e();
        eVar.element = (T) new SpannableString(str);
        UrlModel a2 = c.a(str, z, z2);
        if (a2 == null) {
            textView.setText(eVar.element);
            return false;
        }
        int textSize = (int) textView.getTextSize();
        eVar.element = (T) new SpannableString(l.a(str, (Object) h.b(R.string.g2t)));
        r.a(v.a(a2)).a("hashtagemoji").a(new c.a(textSize, eVar, textView, str, str2, z2));
        return true;
    }

    @Override // com.ss.android.ugc.aweme.commerce_challenge_api.service.ICommerceChallengeService
    public final boolean a(Context context, String str, UrlModel urlModel, SpannableString spannableString, TextView textView, String str2) {
        l.d(context, "");
        l.d(urlModel, "");
        l.d(textView, "");
        l.d(context, "");
        l.d(urlModel, "");
        l.d(textView, "");
        if (TextUtils.isEmpty(String.valueOf(spannableString))) {
            return false;
        }
        int textSize = (int) textView.getTextSize();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(spannableString);
        spannableStringBuilder.append((CharSequence) " ");
        textView.setText(spannableStringBuilder);
        r.a(v.a(urlModel)).a("hashtagemoji").a(new c.d(textSize, spannableStringBuilder, textView, str, str2));
        return true;
    }

    @Override // com.ss.android.ugc.aweme.commerce_challenge_api.service.ICommerceChallengeService
    public final void a(String str, String str2) {
        Uri parse;
        if (str != null && (parse = Uri.parse(str)) != null) {
            a.a(parse, str2);
        }
    }

    @Override // com.ss.android.ugc.aweme.commerce_challenge_api.service.ICommerceChallengeService
    public final com.ss.android.ugc.aweme.commerce_challenge_api.c.a a() {
        return new com.ss.android.ugc.aweme.commerce_challenge_impl.a.a();
    }

    @Override // com.ss.android.ugc.aweme.commerce_challenge_api.service.ICommerceChallengeService
    public final void b() {
        c.f73556c.clear();
        c.f73555b = false;
    }

    @Override // com.ss.android.ugc.aweme.commerce_challenge_api.service.ICommerceChallengeService
    public final LinkedHashMap<String, Bitmap> c() {
        if (com.ss.android.ugc.aweme.commerce_challenge_impl.c.a.a()) {
            return c.f73556c;
        }
        return new LinkedHashMap<>();
    }

    @Override // com.ss.android.ugc.aweme.commerce_challenge_api.service.ICommerceChallengeService
    public final boolean d() {
        if (com.ss.android.ugc.aweme.commerce_challenge_impl.c.c.a().isEmpty()) {
            return false;
        }
        return d.a();
    }

    public static ICommerceChallengeService e() {
        MethodCollector.i(2056);
        Object a2 = b.a(ICommerceChallengeService.class, false);
        if (a2 != null) {
            ICommerceChallengeService iCommerceChallengeService = (ICommerceChallengeService) a2;
            MethodCollector.o(2056);
            return iCommerceChallengeService;
        }
        if (b.ag == null) {
            synchronized (ICommerceChallengeService.class) {
                try {
                    if (b.ag == null) {
                        b.ag = new CommerceChallengeServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(2056);
                    throw th;
                }
            }
        }
        CommerceChallengeServiceImpl commerceChallengeServiceImpl = (CommerceChallengeServiceImpl) b.ag;
        MethodCollector.o(2056);
        return commerceChallengeServiceImpl;
    }

    @Override // com.ss.android.ugc.aweme.commerce_challenge_api.service.ICommerceChallengeService
    public final boolean b(String str) {
        return a.b(str);
    }

    @Override // com.ss.android.ugc.aweme.commerce_challenge_api.service.ICommerceChallengeService
    public final boolean c(Challenge challenge) {
        return com.ss.android.ugc.aweme.commerce_challenge_impl.d.b.a(challenge);
    }

    @Override // com.ss.android.ugc.aweme.commerce_challenge_api.service.ICommerceChallengeService
    public final void a(com.ss.android.ugc.aweme.commerce_challenge_api.a.a aVar) {
        l.d(aVar, "");
        com.ss.android.ugc.aweme.commerce_challenge_impl.b.a.f73537a.a(aVar);
    }

    @Override // com.ss.android.ugc.aweme.commerce_challenge_api.service.ICommerceChallengeService
    public final boolean b(Challenge challenge) {
        if (challenge == null || !a.a(challenge)) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.commerce_challenge_api.service.ICommerceChallengeService
    public final void a(TextExtraStruct textExtraStruct) {
        if (textExtraStruct != null && textExtraStruct.isCommerce()) {
            a.a(textExtraStruct.getCid());
            a.a(textExtraStruct.getHashTagName());
        }
    }

    @Override // com.ss.android.ugc.aweme.commerce_challenge_api.service.ICommerceChallengeService
    public final Aweme a(Aweme aweme) {
        if (!(aweme == null || aweme.getTextExtra() == null || TextUtils.isEmpty(aweme.getDesc()))) {
            StringBuffer stringBuffer = new StringBuffer(aweme.getDesc());
            ArrayList arrayList = new ArrayList();
            ArrayList<TextExtraStruct> arrayList2 = new ArrayList();
            List<TextExtraStruct> textExtra = aweme.getTextExtra();
            l.b(textExtra, "");
            arrayList2.addAll(textExtra);
            Collections.sort(arrayList2, new com.ss.android.ugc.aweme.commerce_challenge_impl.d.d());
            int i2 = 0;
            for (TextExtraStruct textExtraStruct : arrayList2) {
                if (i2 != 0) {
                    textExtraStruct.setStart(textExtraStruct.getStart() + i2);
                    textExtraStruct.setEnd(textExtraStruct.getEnd() + i2);
                }
                if (textExtraStruct.getType() == 1 && c.a(textExtraStruct.getHashTagName(), textExtraStruct.isCommerce(), false) != null && textExtraStruct.getHashTagName().length() == (textExtraStruct.getEnd() - textExtraStruct.getStart()) - 1 && stringBuffer.length() >= textExtraStruct.getEnd()) {
                    stringBuffer.insert(textExtraStruct.getEnd(), h.b(R.string.g2t));
                    textExtraStruct.setEnd(textExtraStruct.getEnd() + 1);
                    i2++;
                }
                arrayList.add(textExtraStruct);
            }
            if (i2 != 0) {
                aweme.setDesc(stringBuffer.toString());
                aweme.setTextExtra(arrayList);
            }
        }
        return aweme;
    }

    @Override // com.ss.android.ugc.aweme.commerce_challenge_api.service.ICommerceChallengeService
    public final void a(int i2) {
        long currentTimeMillis;
        long currentTimeMillis2;
        UrlModel urlModel;
        Long l2;
        Long l3;
        if (!com.ss.android.ugc.aweme.commerce_challenge_impl.c.a.a()) {
            c.f73556c.clear();
        } else if (!c.f73555b) {
            c.f73555b = true;
            c.a();
            c.f73556c.clear();
            for (String str : c.f73554a.keySet()) {
                com.ss.android.ugc.aweme.commerce_challenge_api.b.b bVar = c.f73554a.get(str);
                if (bVar == null || (l3 = bVar.f73512a) == null) {
                    currentTimeMillis = (System.currentTimeMillis() / 1000) + 1;
                } else {
                    currentTimeMillis = l3.longValue();
                }
                com.ss.android.ugc.aweme.commerce_challenge_api.b.b bVar2 = c.f73554a.get(str);
                if (bVar2 == null || (l2 = bVar2.f73513b) == null) {
                    currentTimeMillis2 = (System.currentTimeMillis() / 1000) - 1;
                } else {
                    currentTimeMillis2 = l2.longValue();
                }
                long currentTimeMillis3 = System.currentTimeMillis() / 1000;
                if (currentTimeMillis + 1 <= currentTimeMillis3 && currentTimeMillis2 > currentTimeMillis3) {
                    com.ss.android.ugc.aweme.commerce_challenge_api.b.b bVar3 = c.f73554a.get(str);
                    if (bVar3 != null) {
                        urlModel = bVar3.f73514c;
                    } else {
                        urlModel = null;
                    }
                    r.a(v.a(urlModel)).a("hashtagemoji").a(new c.e(str, i2));
                }
            }
        }
    }

    /*  JADX ERROR: StackOverflowError in pass: MarkFinallyVisitor
        java.lang.StackOverflowError
        	at jadx.core.dex.nodes.InsnNode.isSame(InsnNode.java:303)
        	at jadx.core.dex.instructions.InvokeNode.isSame(InvokeNode.java:77)
        	at jadx.core.dex.visitors.MarkFinallyVisitor.sameInsns(MarkFinallyVisitor.java:451)
        	at jadx.core.dex.visitors.MarkFinallyVisitor.compareBlocks(MarkFinallyVisitor.java:436)
        	at jadx.core.dex.visitors.MarkFinallyVisitor.checkBlocksTree(MarkFinallyVisitor.java:408)
        	at jadx.core.dex.visitors.MarkFinallyVisitor.checkBlocksTree(MarkFinallyVisitor.java:411)
        */
    @Override // com.ss.android.ugc.aweme.commerce_challenge_api.service.ICommerceChallengeService
    public final void a(com.ss.android.ugc.aweme.discover.model.Challenge r6) {
        /*
            r5 = this;
            if (r6 == 0) goto L_0x0053
            boolean r1 = com.ss.android.ugc.aweme.commerce_challenge_impl.d.a.a(r6)
            r0 = 1
            if (r1 == r0) goto L_0x000a
            return
        L_0x000a:
            java.util.concurrent.locks.ReentrantReadWriteLock r1 = com.ss.android.ugc.aweme.commerce_challenge_impl.d.a.f73550a
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r4 = r1.readLock()
            int r0 = r1.getWriteHoldCount()
            r3 = 0
            if (r0 != 0) goto L_0x0024
            int r2 = r1.getReadHoldCount()
            r0 = 0
        L_0x001c:
            if (r0 >= r2) goto L_0x0025
            r4.unlock()
            int r0 = r0 + 1
            goto L_0x001c
        L_0x0024:
            r2 = 0
        L_0x0025:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r1 = r1.writeLock()
            r1.lock()
            java.lang.String r0 = r6.getCid()     // Catch:{ all -> 0x0046 }
            com.ss.android.ugc.aweme.commerce_challenge_impl.d.a.c(r0)     // Catch:{ all -> 0x0046 }
            java.lang.String r0 = r6.getChallengeName()     // Catch:{ all -> 0x0046 }
            com.ss.android.ugc.aweme.commerce_challenge_impl.d.a.c(r0)     // Catch:{ all -> 0x0046 }
        L_0x003a:
            if (r3 >= r2) goto L_0x0042
            r4.lock()
            int r3 = r3 + 1
            goto L_0x003a
        L_0x0042:
            r1.unlock()
            return
        L_0x0046:
            r0 = move-exception
        L_0x0047:
            if (r3 >= r2) goto L_0x004f
            r4.lock()
            int r3 = r3 + 1
            goto L_0x0047
        L_0x004f:
            r1.unlock()
            throw r0
        L_0x0053:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commerce_challenge_impl.service.CommerceChallengeServiceImpl.a(com.ss.android.ugc.aweme.discover.model.Challenge):void");
    }

    @Override // com.ss.android.ugc.aweme.commerce_challenge_api.service.ICommerceChallengeService
    public final void a(Uri uri, String str) {
        a.a(uri, str);
    }

    @Override // com.ss.android.ugc.aweme.commerce_challenge_api.service.ICommerceChallengeService
    public final void b(String str, String str2) {
        if (str2 != null && str2.length() != 0) {
            com.ss.android.ugc.aweme.app.f.d dVar = new com.ss.android.ugc.aweme.app.f.d();
            Objects.requireNonNull(str2, "null cannot be cast to non-null type java.lang.String");
            String lowerCase = str2.toLowerCase();
            l.b(lowerCase, "");
            com.ss.android.ugc.aweme.app.f.d a2 = dVar.a("tag_name", lowerCase);
            if (str == null) {
                str = "";
            }
            com.ss.android.ugc.aweme.common.r.a("click_commercial_emoji", a2.a("enter_from", str).f66730a);
        }
    }

    @Override // com.ss.android.ugc.aweme.commerce_challenge_api.service.ICommerceChallengeService
    public final UrlModel a(String str, boolean z, boolean z2) {
        return c.a(str, z, z2);
    }

    @Override // com.ss.android.ugc.aweme.commerce_challenge_api.service.ICommerceChallengeService
    public final void a(MentionTextView mentionTextView, Aweme aweme, String str) {
        UrlModel a2;
        l.d(mentionTextView, "");
        l.d(mentionTextView, "");
        if (!(aweme == null || aweme.getTextExtra() == null || TextUtils.isEmpty(aweme.getDesc()))) {
            ArrayList<TextExtraStruct> arrayList = new ArrayList();
            List<TextExtraStruct> textExtra = aweme.getTextExtra();
            l.b(textExtra, "");
            arrayList.addAll(textExtra);
            for (TextExtraStruct textExtraStruct : arrayList) {
                if (textExtraStruct.getType() == 1 && c.a(aweme, textExtraStruct) && (a2 = c.a(textExtraStruct.getHashTagName(), textExtraStruct.isCommerce(), false)) != null) {
                    e.a(a2, (int) mentionTextView.getTextSize(), (int) mentionTextView.getTextSize(), new c.b(mentionTextView, textExtraStruct, str));
                }
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r10v0, resolved type: android.text.SpannableString */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.commerce_challenge_api.service.ICommerceChallengeService
    public final void a(TextView textView, Aweme aweme, SpannableString spannableString, String str) {
        UrlModel a2;
        l.d(textView, "");
        l.d(spannableString, "");
        l.d(textView, "");
        l.d(spannableString, "");
        if (aweme != null) {
            z.e eVar = new z.e();
            eVar.element = spannableString;
            if (!(aweme.getTextExtra() == null || TextUtils.isEmpty(spannableString))) {
                for (TextExtraStruct textExtraStruct : aweme.getTextExtra()) {
                    l.b(textExtraStruct, "");
                    if (textExtraStruct.getType() == 1 && c.a(aweme, textExtraStruct) && (a2 = c.a(textExtraStruct.getHashTagName(), textExtraStruct.isCommerce(), false)) != null) {
                        r.a(a2).a("hashtagemoji").a(new c.C1645c(textView, eVar, textExtraStruct, str));
                    }
                }
            }
        }
    }
}
