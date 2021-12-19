package com.ss.android.ugc.aweme.discover.adapter;

import android.content.Context;
import android.os.Looper;
import android.os.Message;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.covode.number.Covode;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.g.b;
import com.ss.android.ugc.aweme.discover.model.Banner;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import com.ss.android.ugc.aweme.profile.ae;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.presenter.UserResponse;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.Objects;
import java.util.concurrent.ExecutionException;

public final class e extends RecyclerView.ViewHolder implements WeakHandler.IHandler {

    /* renamed from: g  reason: collision with root package name */
    public static final a f80540g = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final SmartImageView f80541a;

    /* renamed from: b  reason: collision with root package name */
    Banner f80542b;

    /* renamed from: c  reason: collision with root package name */
    int f80543c;

    /* renamed from: d  reason: collision with root package name */
    final WeakHandler f80544d = new WeakHandler(Looper.getMainLooper(), this);

    /* renamed from: e  reason: collision with root package name */
    String f80545e = "";

    /* renamed from: f  reason: collision with root package name */
    final com.ss.android.ugc.aweme.discover.tooltip.a f80546f;

    static {
        Covode.recordClassIndex(50106);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(50108);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public final void handleMsg(Message message) {
        User user;
        l.d(message, "");
        View view = this.itemView;
        l.b(view, "");
        Context context = view.getContext();
        Object obj = message.obj;
        int i2 = message.what;
        if (obj instanceof ExecutionException) {
            obj = ((ExecutionException) obj).getCause();
        }
        if (obj instanceof com.ss.android.ugc.aweme.base.api.a.b.a) {
            View view2 = this.itemView;
            l.b(view2, "");
            new b(view2).a(((com.ss.android.ugc.aweme.base.api.a.b.a) obj).getErrorMsg()).b();
        } else if (obj instanceof Exception) {
            View view3 = this.itemView;
            l.b(view3, "");
            new b(view3).e(R.string.de9).b();
        } else if (i2 == ae.f115954a.getMessageProfile()) {
            if (obj instanceof User) {
                Object obj2 = message.obj;
                Objects.requireNonNull(obj2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.profile.model.User");
                user = (User) obj2;
            } else if (obj instanceof UserResponse) {
                user = ((UserResponse) obj).getUser();
            } else {
                return;
            }
            EnterRoomConfig enterRoomConfig = new EnterRoomConfig();
            EnterRoomConfig.LogData logData = enterRoomConfig.f23298b;
            Banner banner = this.f80542b;
            if (banner == null) {
                l.b();
            }
            logData.f23309a = banner.getRequestId();
            enterRoomConfig.f23299c.J = "discovery";
            ILiveOuterService s = LiveOuterService.s();
            l.b(s, "");
            s.i().a(context, user, enterRoomConfig);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e(com.ss.android.ugc.aweme.discover.tooltip.a aVar, View view) {
        super(view);
        l.d(aVar, "");
        l.d(view, "");
        View findViewById = view.findViewById(R.id.dtl);
        l.b(findViewById, "");
        SmartImageView smartImageView = (SmartImageView) findViewById;
        this.f80541a = smartImageView;
        this.f80546f = aVar;
        smartImageView.setOnClickListener(new View.OnClickListener(this) {
            /* class com.ss.android.ugc.aweme.discover.adapter.e.AnonymousClass1 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ e f80547a;

            static {
                Covode.recordClassIndex(50107);
            }

            {
                this.f80547a = r1;
            }

            /* JADX WARNING: Removed duplicated region for block: B:69:0x0262  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void onClick(android.view.View r22) {
                /*
                // Method dump skipped, instructions count: 1109
                */
                throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.discover.adapter.e.AnonymousClass1.onClick(android.view.View):void");
            }
        });
    }
}
