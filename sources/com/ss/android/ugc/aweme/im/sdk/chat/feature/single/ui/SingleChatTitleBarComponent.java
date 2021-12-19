package com.ss.android.ugc.aweme.im.sdk.chat.feature.single.ui;

import androidx.lifecycle.i;
import androidx.lifecycle.m;
import androidx.lifecycle.v;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.im.sdk.chat.a.d;
import com.ss.android.ugc.aweme.im.sdk.chat.b.c.f;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.c;
import com.ss.android.ugc.aweme.im.sdk.common.controller.a.e;
import com.ss.android.ugc.aweme.im.sdk.common.controller.e.g;
import com.ss.android.ugc.aweme.im.sdk.common.ui.widget.ImTextTitleBar;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class SingleChatTitleBarComponent implements au, c {

    /* renamed from: a  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.im.sdk.chat.feature.single.a.a f101022a;

    /* renamed from: b  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.im.sdk.chat.ui.c.a f101023b;

    /* renamed from: c  reason: collision with root package name */
    public final ImTextTitleBar f101024c;

    static {
        Covode.recordClassIndex(64620);
    }

    @Override // androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        if (aVar == i.a.ON_CREATE) {
            onCreate();
        }
    }

    public static final class b implements ImTextTitleBar.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ SingleChatTitleBarComponent f101026a;

        static {
            Covode.recordClassIndex(64622);
        }

        @Override // com.ss.android.ugc.aweme.im.sdk.common.ui.widget.ImTextTitleBar.a
        public final void b() {
        }

        @Override // com.ss.android.ugc.aweme.im.sdk.common.ui.widget.ImTextTitleBar.a
        public final void a() {
            this.f101026a.f101023b.c();
            this.f101026a.f101023b.requireActivity().finish();
        }

        @Override // com.ss.android.ugc.aweme.im.sdk.common.ui.widget.ImTextTitleBar.a
        public final void c() {
            String singleChatFromUserId = this.f101026a.f101022a.getSingleChatFromUserId();
            com.ss.android.ugc.aweme.im.sdk.chatlist.controller.helper.c.a(singleChatFromUserId);
            d.a(singleChatFromUserId, "chat", "click_name");
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        b(SingleChatTitleBarComponent singleChatTitleBarComponent) {
            this.f101026a = singleChatTitleBarComponent;
        }

        /*  JADX ERROR: IndexOutOfBoundsException in pass: MethodInvokeVisitor
            java.lang.IndexOutOfBoundsException: Index: 0
            	at java.base/java.util.Collections$EmptyList.get(Collections.java:4586)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.searchCastTypes(MethodInvokeVisitor.java:267)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.processOverloaded(MethodInvokeVisitor.java:127)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.processInvoke(MethodInvokeVisitor.java:102)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.processInsn(MethodInvokeVisitor.java:73)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.visit(MethodInvokeVisitor.java:66)
            */
        @Override // com.ss.android.ugc.aweme.im.sdk.common.ui.widget.ImTextTitleBar.a
        public final void a(int r9) {
            /*
            // Method dump skipped, instructions count: 182
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.chat.feature.single.ui.SingleChatTitleBarComponent.b.a(int):void");
        }
    }

    @v(a = i.a.ON_CREATE)
    public final void onCreate() {
        String str;
        ImTextTitleBar imTextTitleBar = this.f101024c;
        IMUser fromUser = this.f101022a.getFromUser();
        if (fromUser != null) {
            str = fromUser.getDisplayName();
        } else {
            str = null;
        }
        imTextTitleBar.setTitle(str);
        if (e.b()) {
            this.f101024c.setRightIcons(R.raw.icon_flag, R.raw.icon_ellipsis_horizontal);
        }
        this.f101024c.setOnTitlebarClickListener(new b(this));
        IMUser fromUser2 = this.f101022a.getFromUser();
        if (fromUser2 != null && !IMUser.isInvalidUser(fromUser2.getUid())) {
            g.b(fromUser2.getUid(), fromUser2.getSecUid(), new a(this));
        }
    }

    public static final class a implements com.ss.android.ugc.aweme.im.service.i.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ SingleChatTitleBarComponent f101025a;

        static {
            Covode.recordClassIndex(64621);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        a(SingleChatTitleBarComponent singleChatTitleBarComponent) {
            this.f101025a = singleChatTitleBarComponent;
        }

        @Override // com.ss.android.ugc.aweme.im.service.i.a
        public final void a(Throwable th) {
            l.d(th, "");
            l.d(th, "");
        }

        @Override // com.ss.android.ugc.aweme.im.service.i.a
        public final void a(IMUser iMUser) {
            String displayName;
            if (iMUser != null) {
                this.f101025a.f101022a.setFromUser(iMUser);
                IMUser fromUser = this.f101025a.f101022a.getFromUser();
                if (!(fromUser == null || (displayName = fromUser.getDisplayName()) == null)) {
                    this.f101025a.f101024c.setTitle(displayName);
                }
                f.a(this.f101025a.f101022a.getFromUser(), this.f101025a.f101022a.getConversationId(), Integer.valueOf(this.f101025a.f101022a.getEnterFrom()), "SingleChatPanel");
            }
        }
    }

    public SingleChatTitleBarComponent(com.ss.android.ugc.aweme.im.sdk.chat.feature.single.a.a aVar, com.ss.android.ugc.aweme.im.sdk.chat.ui.c.a aVar2, ImTextTitleBar imTextTitleBar) {
        l.d(aVar, "");
        l.d(aVar2, "");
        l.d(imTextTitleBar, "");
        this.f101022a = aVar;
        this.f101023b = aVar2;
        this.f101024c = imTextTitleBar;
    }
}
