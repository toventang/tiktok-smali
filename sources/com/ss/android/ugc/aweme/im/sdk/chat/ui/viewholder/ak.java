package com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder;

import android.os.Bundle;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.im.core.d.ai;
import com.ss.android.ugc.aweme.feed.model.live.NewLiveRoomStruct;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.ShareLiveContent;
import com.ss.android.ugc.aweme.im.sdk.common.controller.utils.ag;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import com.ss.android.ugc.aweme.profile.model.User;
import f.a.d.f;
import h.f.b.l;
import h.f.b.m;
import h.f.b.z;
import h.h;
import h.i;

public final class ak implements View.OnAttachStateChangeListener {

    /* renamed from: a  reason: collision with root package name */
    ai f101341a;

    /* renamed from: b  reason: collision with root package name */
    ShareLiveContent f101342b;

    /* renamed from: c  reason: collision with root package name */
    boolean f101343c;

    /* renamed from: d  reason: collision with root package name */
    private final h f101344d = i.a((h.f.a.a) e.f101365a);

    /* renamed from: e  reason: collision with root package name */
    private final View f101345e;

    /* access modifiers changed from: package-private */
    public static final class d<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        public static final d f101364a = new d();

        static {
            Covode.recordClassIndex(64815);
        }

        d() {
        }

        @Override // f.a.d.f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    static {
        Covode.recordClassIndex(64811);
    }

    /* access modifiers changed from: package-private */
    public final f.a.b.a a() {
        return (f.a.b.a) this.f101344d.getValue();
    }

    public final void onViewAttachedToWindow(View view) {
    }

    static final class e extends m implements h.f.a.a<f.a.b.a> {

        /* renamed from: a  reason: collision with root package name */
        public static final e f101365a = new e();

        static {
            Covode.recordClassIndex(64816);
        }

        e() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ f.a.b.a invoke() {
            return new f.a.b.a();
        }
    }

    /* access modifiers changed from: package-private */
    public final void b() {
        String str;
        String str2;
        ShareLiveContent shareLiveContent = this.f101342b;
        String str3 = null;
        if (shareLiveContent != null) {
            str = shareLiveContent.getRoomOwnerId();
        } else {
            str = null;
        }
        ShareLiveContent shareLiveContent2 = this.f101342b;
        if (shareLiveContent2 != null) {
            str2 = shareLiveContent2.getRoomSecOwnerId();
        } else {
            str2 = null;
        }
        ag.a(str, str2);
        ShareLiveContent shareLiveContent3 = this.f101342b;
        if (shareLiveContent3 != null) {
            str3 = shareLiveContent3.getRoomOwnerId();
        }
        com.ss.android.ugc.aweme.im.sdk.chat.a.d.a(str3, "chat", "click_head");
    }

    public final void onViewDetachedFromWindow(View view) {
        a().a();
    }

    /* access modifiers changed from: package-private */
    public static final class c<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ak f101358a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ z.d f101359b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f101360c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ long f101361d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ NewLiveRoomStruct f101362e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ String f101363f;

        static {
            Covode.recordClassIndex(64814);
        }

        c(ak akVar, z.d dVar, String str, long j2, NewLiveRoomStruct newLiveRoomStruct, String str2) {
            this.f101358a = akVar;
            this.f101359b = dVar;
            this.f101360c = str;
            this.f101361d = j2;
            this.f101362e = newLiveRoomStruct;
            this.f101363f = str2;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            this.f101358a.a(this.f101362e, false);
        }
    }

    public ak(View view) {
        l.d(view, "");
        this.f101345e = view;
        view.addOnAttachStateChangeListener(this);
    }

    /* access modifiers changed from: package-private */
    public static final class a<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ak f101346a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ z.d f101347b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f101348c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ long f101349d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ NewLiveRoomStruct f101350e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ String f101351f;

        static {
            Covode.recordClassIndex(64812);
        }

        a(ak akVar, z.d dVar, String str, long j2, NewLiveRoomStruct newLiveRoomStruct, String str2) {
            this.f101346a = akVar;
            this.f101347b = dVar;
            this.f101348c = str;
            this.f101349d = j2;
            this.f101350e = newLiveRoomStruct;
            this.f101351f = str2;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            NewLiveRoomStruct newLiveRoomStruct = (NewLiveRoomStruct) obj;
            if (newLiveRoomStruct != null) {
                if (this.f101349d == newLiveRoomStruct.id) {
                    return;
                }
            } else if ((newLiveRoomStruct == null && this.f101350e == null) || 1 == 0) {
                return;
            }
            com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.im.sdk.chat.data.b.a(this.f101351f, newLiveRoomStruct));
        }
    }

    /* access modifiers changed from: package-private */
    public static final class b<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ak f101352a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ z.d f101353b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f101354c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ long f101355d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ NewLiveRoomStruct f101356e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ String f101357f;

        static {
            Covode.recordClassIndex(64813);
        }

        b(ak akVar, z.d dVar, String str, long j2, NewLiveRoomStruct newLiveRoomStruct, String str2) {
            this.f101352a = akVar;
            this.f101353b = dVar;
            this.f101354c = str;
            this.f101355d = j2;
            this.f101356e = newLiveRoomStruct;
            this.f101357f = str2;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:15:0x0027, code lost:
            if (1 != 0) goto L_0x0029;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x0029, code lost:
            com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.im.sdk.chat.data.b.a(r6.f101357f, r7));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:3:0x000b, code lost:
            if (r6.f101355d == r7.id) goto L_0x000d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:7:0x0015, code lost:
            if (r7.id != 0) goto L_0x0019;
         */
        @Override // f.a.d.f
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ void accept(java.lang.Object r7) {
            /*
                r6 = this;
                com.ss.android.ugc.aweme.feed.model.live.NewLiveRoomStruct r7 = (com.ss.android.ugc.aweme.feed.model.live.NewLiveRoomStruct) r7
                r5 = 0
                if (r7 == 0) goto L_0x001f
                long r3 = r6.f101355d
                long r1 = r7.id
                int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
                if (r0 != 0) goto L_0x0029
            L_0x000d:
                r3 = 0
                if (r7 == 0) goto L_0x0017
                long r1 = r7.id
                int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                if (r0 != 0) goto L_0x0019
            L_0x0017:
                com.ss.android.ugc.aweme.feed.model.live.NewLiveRoomStruct r7 = r6.f101356e
            L_0x0019:
                com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.ak r0 = r6.f101352a
                r0.a(r7, r5)
                return
            L_0x001f:
                r1 = 1
                if (r7 != 0) goto L_0x0027
                com.ss.android.ugc.aweme.feed.model.live.NewLiveRoomStruct r0 = r6.f101356e
                if (r0 != 0) goto L_0x0027
                goto L_0x0017
            L_0x0027:
                if (r1 == 0) goto L_0x000d
            L_0x0029:
                com.ss.android.ugc.aweme.im.sdk.chat.data.b.a r1 = new com.ss.android.ugc.aweme.im.sdk.chat.data.b.a
                java.lang.String r0 = r6.f101357f
                r1.<init>(r0, r7)
                com.ss.android.ugc.d.a.c.a(r1)
                goto L_0x000d
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.ak.b.accept(java.lang.Object):void");
        }
    }

    public final void a(NewLiveRoomStruct newLiveRoomStruct, boolean z) {
        this.f101343c = false;
        if (newLiveRoomStruct != null) {
            long j2 = newLiveRoomStruct.id;
            if (j2 != 0) {
                a(newLiveRoomStruct, j2, z);
                return;
            }
        }
        b();
    }

    private final void a(NewLiveRoomStruct newLiveRoomStruct, long j2, boolean z) {
        Long l2;
        String str;
        String str2;
        if (this.f101342b != null) {
            Bundle bundle = new Bundle();
            ai aiVar = this.f101341a;
            if (aiVar != null) {
                l2 = Long.valueOf(aiVar.getSender());
            } else {
                l2 = null;
            }
            bundle.putString("share_user_id", String.valueOf(l2));
            User user = new User();
            ShareLiveContent shareLiveContent = this.f101342b;
            if (shareLiveContent != null) {
                str = shareLiveContent.getRoomOwnerId();
            } else {
                str = null;
            }
            user.setUid(str);
            ShareLiveContent shareLiveContent2 = this.f101342b;
            if (shareLiveContent2 != null) {
                str2 = shareLiveContent2.getRoomSecOwnerId();
            } else {
                str2 = null;
            }
            user.setSecUid(str2);
            user.roomId = j2;
            if (!z) {
                ILiveOuterService s = LiveOuterService.s();
                l.b(s, "");
                s.i().a(this.f101345e.getContext(), user, null, bundle);
                return;
            }
            ILiveOuterService s2 = LiveOuterService.s();
            l.b(s2, "");
            s2.i().a(this.f101345e.getContext(), user, newLiveRoomStruct, bundle);
        }
    }
}
