package com.ss.android.ugc.aweme.deeplink.actions.a;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import com.bytedance.android.livesdk.livesetting.pullstream.LiveNetAdaptiveHurryTimeSetting;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.deeplink.q;
import h.c.b.a.k;
import h.f.a.m;
import h.f.b.l;
import h.p;
import h.r;
import h.z;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;
import kotlinx.coroutines.ah;
import kotlinx.coroutines.am;
import kotlinx.coroutines.an;
import kotlinx.coroutines.bf;
import kotlinx.coroutines.bz;
import kotlinx.coroutines.i;
import kotlinx.coroutines.internal.o;

public abstract class b<T> extends a {
    public static final a Companion = new a((byte) 0);
    private Context context;
    public T customResult;
    private String enterFrom = "";
    public HashMap<String, Object> globalParams;
    private boolean isFromNotification;
    public Uri originalUri;
    public Uri terminalPrefixUri;

    /* access modifiers changed from: package-private */
    public static final class c extends h.c.b.a.d {
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(49348);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(b bVar, h.c.d dVar) {
            super(dVar);
            this.this$0 = bVar;
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.preRunBlock(this);
        }
    }

    static {
        Covode.recordClassIndex(49344);
    }

    public static int com_ss_android_ugc_aweme_deeplink_actions_base_BaseLinkAction_com_ss_android_ugc_aweme_lancet_LogLancet_d(String str, String str2) {
        return 0;
    }

    public abstract p<String, HashMap<String, Object>> buildInnerUrl(String str, HashMap<String, Object> hashMap);

    public ArrayList<Integer> getFlags() {
        return null;
    }

    public final boolean isAsyncAction() {
        return false;
    }

    public final boolean needIntercept() {
        return false;
    }

    public static final class a {
        static {
            Covode.recordClassIndex(49345);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final String getEnterFrom() {
        return this.enterFrom;
    }

    public final T getResult() {
        return this.customResult;
    }

    public final boolean isFromNotification() {
        return this.isFromNotification;
    }

    public final HashMap<String, Object> getGlobalParams() {
        HashMap<String, Object> hashMap = this.globalParams;
        if (hashMap == null) {
            l.a("globalParams");
        }
        return hashMap;
    }

    public final Uri getOriginalUri() {
        Uri uri = this.originalUri;
        if (uri == null) {
            l.a("originalUri");
        }
        return uri;
    }

    public final Uri getTerminalPrefixUri() {
        Uri uri = this.terminalPrefixUri;
        if (uri == null) {
            l.a("terminalPrefixUri");
        }
        return uri;
    }

    public String getTargetPageName() {
        Uri uri = this.terminalPrefixUri;
        if (uri == null) {
            l.a("terminalPrefixUri");
        }
        String host = uri.getHost();
        if (host == null) {
            return "homepage_hot";
        }
        return host;
    }

    public final void setFromNotification(boolean z) {
        this.isFromNotification = z;
    }

    public final void setEnterFrom(String str) {
        l.d(str, "");
        this.enterFrom = str;
    }

    public final void setGlobalParams(HashMap<String, Object> hashMap) {
        l.d(hashMap, "");
        this.globalParams = hashMap;
    }

    public final void setOriginalUri(Uri uri) {
        l.d(uri, "");
        this.originalUri = uri;
    }

    public final void setTerminalPrefixUri(Uri uri) {
        l.d(uri, "");
        this.terminalPrefixUri = uri;
    }

    /* access modifiers changed from: package-private */
    public static final class d extends k implements m<am, h.c.d, Object> {
        int label;
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(49349);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(b bVar, h.c.d dVar) {
            super(2, dVar);
            this.this$0 = bVar;
        }

        @Override // h.c.b.a.a
        public final h.c.d<z> create(Object obj, h.c.d<?> dVar) {
            l.d(dVar, "");
            return new d(this.this$0, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final Object invoke(am amVar, h.c.d dVar) {
            return ((d) create(amVar, dVar)).invokeSuspend(z.f158842a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            if (this.label == 0) {
                r.a(obj);
                this.this$0.getActionName();
                return null;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    private final void parseParams(HashMap<String, Object> hashMap) {
        if (hashMap.containsKey("is_from_notification")) {
            Object obj = hashMap.get("is_from_notification");
            Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.Boolean");
            this.isFromNotification = ((Boolean) obj).booleanValue();
        }
        if (hashMap.containsKey("enter_from")) {
            Object obj2 = hashMap.get("enter_from");
            Objects.requireNonNull(obj2, "null cannot be cast to non-null type kotlin.String");
            this.enterFrom = (String) obj2;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.deeplink.actions.a.b$b  reason: collision with other inner class name */
    public static final class C1851b extends k implements m<am, h.c.d<? super z>, Object> {
        final /* synthetic */ Context $context$inlined;
        final /* synthetic */ String $it;
        Object L$0;
        int label;
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(49346);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1851b(String str, h.c.d dVar, b bVar, Context context) {
            super(2, dVar);
            this.$it = str;
            this.this$0 = bVar;
            this.$context$inlined = context;
        }

        @Override // h.c.b.a.a
        public final h.c.d<z> create(Object obj, h.c.d<?> dVar) {
            l.d(dVar, "");
            return new C1851b(this.$it, dVar, this.this$0, this.$context$inlined);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final Object invoke(am amVar, h.c.d<? super z> dVar) {
            return ((C1851b) create(amVar, dVar)).invokeSuspend(z.f158842a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            b bVar;
            h.c.a.a aVar = h.c.a.a.COROUTINE_SUSPENDED;
            int i2 = this.label;
            if (i2 == 0) {
                r.a(obj);
                bVar = this.this$0;
                ah ahVar = bf.f159041b;
                AnonymousClass1 r1 = new m<am, h.c.d<? super T>, Object>(this, null) {
                    /* class com.ss.android.ugc.aweme.deeplink.actions.a.b.C1851b.AnonymousClass1 */
                    int label;
                    final /* synthetic */ C1851b this$0;

                    static {
                        Covode.recordClassIndex(49347);
                    }

                    {
                        this.this$0 = r2;
                    }

                    @Override // h.c.b.a.a
                    public final h.c.d<z> create(Object obj, h.c.d<?> dVar) {
                        l.d(dVar, "");
                        return 

                        /* JADX WARNING: Removed duplicated region for block: B:10:0x0023  */
                        /* JADX WARNING: Removed duplicated region for block: B:7:0x001d  */
                        /* Code decompiled incorrectly, please refer to instructions dump. */
                        public final java.lang.Object preRunBlock(h.c.d<? super T> r7) {
                            /*
                                r6 = this;
                                boolean r0 = r7 instanceof com.ss.android.ugc.aweme.deeplink.actions.a.b.c
                                if (r0 == 0) goto L_0x0036
                                r5 = r7
                                com.ss.android.ugc.aweme.deeplink.actions.a.b$c r5 = (com.ss.android.ugc.aweme.deeplink.actions.a.b.c) r5
                                int r0 = r5.label
                                r1 = -2147483648(0xffffffff80000000, float:-0.0)
                                r0 = r0 & r1
                                if (r0 == 0) goto L_0x0036
                                int r0 = r5.label
                                int r0 = r0 - r1
                                r5.label = r0
                            L_0x0013:
                                java.lang.Object r1 = r5.result
                                h.c.a.a r4 = h.c.a.a.COROUTINE_SUSPENDED
                                int r0 = r5.label
                                r3 = 0
                                r2 = 1
                                if (r0 == 0) goto L_0x0023
                                if (r0 != r2) goto L_0x003c
                                h.r.a(r1)
                            L_0x0022:
                                return r3
                            L_0x0023:
                                h.r.a(r1)
                                kotlinx.coroutines.ah r1 = kotlinx.coroutines.bf.f159040a
                                com.ss.android.ugc.aweme.deeplink.actions.a.b$d r0 = new com.ss.android.ugc.aweme.deeplink.actions.a.b$d
                                r0.<init>(r6, r3)
                                r5.label = r2
                                java.lang.Object r0 = kotlinx.coroutines.i.a(r1, r0, r5)
                                if (r0 != r4) goto L_0x0022
                                return r4
                            L_0x0036:
                                com.ss.android.ugc.aweme.deeplink.actions.a.b$c r5 = new com.ss.android.ugc.aweme.deeplink.actions.a.b$c
                                r5.<init>(r6, r7)
                                goto L_0x0013
                            L_0x003c:
                                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                                r1.<init>(r0)
                                throw r1
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.deeplink.actions.a.b.preRunBlock(h.c.d):java.lang.Object");
                        }

                        private final void handleOpen(String str, Context context2) {
                            if (!needIntercept()) {
                                onActionPreHandleFinish();
                                Uri parse = Uri.parse(str);
                                l.b(parse, "");
                                p<String, HashMap<String, Object>> buildInnerUrl = buildInnerUrl(str, q.a.a(parse.getQuery()));
                                String first = buildInnerUrl.getFirst();
                                HashMap<String, Object> second = buildInnerUrl.getSecond();
                                HashMap<String, Object> hashMap = this.globalParams;
                                if (hashMap == null) {
                                    l.a("globalParams");
                                }
                                second.putAll(hashMap);
                                com_ss_android_ugc_aweme_deeplink_actions_base_BaseLinkAction_com_ss_android_ugc_aweme_lancet_LogLancet_d("UG-deeplink-refactor", "BaseLinkAction finalUrl = ".concat(String.valueOf(first + "?" + q.a.a(second))));
                                Uri parse2 = Uri.parse(first);
                                l.b(parse2, "");
                                this.terminalPrefixUri = parse2;
                                com.ss.android.ugc.aweme.deeplink.d.c.b("TerminalNode");
                                if (doRealOpen(context2, first, second, getFlags())) {
                                    Uri uri = this.originalUri;
                                    if (uri == null) {
                                        l.a("originalUri");
                                    }
                                    com.ss.android.ugc.aweme.deeplink.d.c.a("Transfer", LiveNetAdaptiveHurryTimeSetting.DEFAULT, uri, "");
                                    return;
                                }
                                Uri uri2 = this.originalUri;
                                if (uri2 == null) {
                                    l.a("originalUri");
                                }
                                com.ss.android.ugc.aweme.deeplink.d.c.a("Transfer", 3002, uri2, "action match but jump fail");
                                return;
                            }
                            com_ss_android_ugc_aweme_deeplink_actions_base_BaseLinkAction_com_ss_android_ugc_aweme_lancet_LogLancet_d("UG-deeplink-refactor", getActionName() + "was intercepted");
                            onActionPreHandleFinish();
                            onActionIntercept();
                            com.ss.android.ugc.aweme.deeplink.d.c.b("TerminalNode");
                            Uri uri3 = this.originalUri;
                            if (uri3 == null) {
                                l.a("originalUri");
                            }
                            com.ss.android.ugc.aweme.deeplink.d.c.a("Transfer", LiveNetAdaptiveHurryTimeSetting.DEFAULT, uri3, "");
                        }

                        public final void handleOpenWithAsyncResult(String str, Context context2, T t) {
                            handleOpen(str, context2);
                        }

                        public final void open(Context context2, String str, HashMap<String, Object> hashMap) {
                            l.d(context2, "");
                            l.d(hashMap, "");
                            com_ss_android_ugc_aweme_deeplink_actions_base_BaseLinkAction_com_ss_android_ugc_aweme_lancet_LogLancet_d("UG-deeplink-refactor", "BaseLinkAction call open");
                            onActionStart();
                            this.context = context2;
                            this.globalParams = hashMap;
                            Uri parse = Uri.parse(str);
                            l.b(parse, "");
                            this.originalUri = parse;
                            if (parse == null) {
                                l.a("originalUri");
                            }
                            this.terminalPrefixUri = parse;
                            parseParams(hashMap);
                            if (str != null) {
                                if (isAsyncAction()) {
                                    bz unused = i.a(an.a(o.f159148a), null, null, new C1851b(str, null, this, context2), 3);
                                } else {
                                    handleOpen(str, context2);
                                }
                            }
                            if (this.context instanceof Activity) {
                                com_ss_android_ugc_aweme_deeplink_actions_base_BaseLinkAction_com_ss_android_ugc_aweme_lancet_LogLancet_d("UG-deeplink-refactor", "BaseLinkAction call activity.finish()");
                                Context context3 = this.context;
                                Objects.requireNonNull(context3, "null cannot be cast to non-null type android.app.Activity");
                                ((Activity) context3).finish();
                            }
                        }
                    }
