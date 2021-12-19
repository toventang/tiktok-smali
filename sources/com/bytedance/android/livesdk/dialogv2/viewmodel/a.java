package com.bytedance.android.livesdk.dialogv2.viewmodel;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.livesdk.guide.c;
import com.bytedance.android.livesdk.olddialog.viewmodel.GiftDialogViewModel;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class a {

    /* renamed from: m  reason: collision with root package name */
    public static final C0355a f17004m = new C0355a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public Long f17005a;

    /* renamed from: b  reason: collision with root package name */
    public User f17006b;

    /* renamed from: c  reason: collision with root package name */
    public GiftDialogViewModel.b f17007c;

    /* renamed from: d  reason: collision with root package name */
    public Room f17008d;

    /* renamed from: e  reason: collision with root package name */
    public String f17009e;

    /* renamed from: f  reason: collision with root package name */
    public long f17010f;

    /* renamed from: g  reason: collision with root package name */
    public int f17011g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f17012h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f17013i;

    /* renamed from: j  reason: collision with root package name */
    public int f17014j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f17015k;

    /* renamed from: l  reason: collision with root package name */
    public long f17016l;

    static {
        Covode.recordClassIndex(9452);
    }

    /* renamed from: com.bytedance.android.livesdk.dialogv2.viewmodel.a$a  reason: collision with other inner class name */
    public static final class C0355a {

        /* renamed from: com.bytedance.android.livesdk.dialogv2.viewmodel.a$a$a  reason: collision with other inner class name */
        public static final class C0356a {

            /* renamed from: a  reason: collision with root package name */
            public static final a f17017a = new a((byte) 0);

            /* renamed from: b  reason: collision with root package name */
            public static final C0357a f17018b = new C0357a((byte) 0);

            /* renamed from: com.bytedance.android.livesdk.dialogv2.viewmodel.a$a$a$a  reason: collision with other inner class name */
            public static final class C0357a {
                static {
                    Covode.recordClassIndex(9455);
                }

                private C0357a() {
                }

                public /* synthetic */ C0357a(byte b2) {
                    this();
                }
            }

            static {
                Covode.recordClassIndex(9454);
            }
        }

        static {
            Covode.recordClassIndex(9453);
        }

        private C0355a() {
        }

        public /* synthetic */ C0355a(byte b2) {
            this();
        }
    }

    public final void a() {
        this.f17010f = com.bytedance.android.livesdk.olddialog.a.a.a(y.e(), "default_dialog_item");
    }

    private a() {
        this.f17005a = 0L;
        this.f17007c = GiftDialogViewModel.b.ANCHOR;
        this.f17009e = "icon";
        this.f17012h = true;
        this.f17013i = true;
    }

    public /* synthetic */ a(byte b2) {
        this();
    }

    public final void a(GiftDialogViewModel.b bVar) {
        l.d(bVar, "");
        this.f17007c = bVar;
    }

    public final void a(String str) {
        if (!c.f18109a || !l.a((Object) "icon", (Object) str)) {
            if (str == null) {
                str = "icon";
            }
            this.f17009e = str;
            this.f17013i = true;
            return;
        }
        this.f17009e = "gift_guide_bubble";
    }
}
