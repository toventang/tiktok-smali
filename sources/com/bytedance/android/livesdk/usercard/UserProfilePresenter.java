package com.bytedance.android.livesdk.usercard;

import android.app.Dialog;
import android.content.Context;
import androidx.fragment.app.d;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import androidx.lifecycle.v;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.n.ac;
import com.bytedance.android.live.n.z;
import com.bytedance.android.livesdk.event.UserProfileEvent;
import com.bytedance.android.livesdk.j.df;
import com.bytedance.android.livesdk.j.dn;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.au;
import f.a.d.f;
import h.f.a.b;
import h.f.b.l;

public final class UserProfilePresenter implements au {

    /* renamed from: a  reason: collision with root package name */
    private d f21787a;

    /* renamed from: b  reason: collision with root package name */
    private final com.bytedance.android.livesdk.ui.a f21788b;

    /* renamed from: c  reason: collision with root package name */
    private final DataChannel f21789c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f21790d;

    final /* synthetic */ class a implements f {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ b f21791a;

        static {
            Covode.recordClassIndex(12838);
        }

        a(b bVar) {
            this.f21791a = bVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            l.b(this.f21791a.invoke(obj), "");
        }
    }

    static {
        Covode.recordClassIndex(12835);
    }

    @Override // androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        if (aVar == i.a.ON_DESTROY) {
            dismissDialog();
        }
    }

    @v(a = i.a.ON_DESTROY)
    public final void dismissDialog() {
        Dialog dialog;
        d dVar;
        d dVar2 = this.f21787a;
        if (dVar2 != null && (dialog = dVar2.getDialog()) != null && dialog.isShowing() && (dVar = this.f21787a) != null) {
            dVar.dismiss();
        }
    }

    public final void onEvent(UserProfileEvent userProfileEvent) {
        Context context;
        long j2;
        Dialog dialog;
        if (this.f21788b.isViewValid()) {
            d dVar = this.f21787a;
            if ((dVar == null || (dialog = dVar.getDialog()) == null || !dialog.isShowing()) && (context = this.f21788b.getContext()) != null) {
                l.b(context, "");
                androidx.fragment.app.i fragmentManager = this.f21788b.getFragmentManager();
                if (fragmentManager != null) {
                    l.b(fragmentManager, "");
                    Room room = (Room) this.f21789c.b(df.class);
                    if (room != null) {
                        d dVar2 = null;
                        if (!room.isOfficial()) {
                            User user = userProfileEvent.user;
                            if (user != null) {
                                j2 = user.getId();
                            } else {
                                j2 = userProfileEvent.userId;
                            }
                            this.f21789c.b(ac.class, (Object) true);
                            d userCardDialog = ((com.bytedance.android.live.q.a) com.bytedance.android.live.t.a.a(com.bytedance.android.live.q.a.class)).getUserCardDialog(context, this.f21790d, j2, room, (User) this.f21789c.b(dn.class), userProfileEvent.mSource, userProfileEvent);
                            if (userCardDialog != null) {
                                userCardDialog.show(fragmentManager, userCardDialog.getClass().getSimpleName());
                                dVar2 = userCardDialog;
                            }
                            this.f21787a = dVar2;
                        }
                    }
                }
            }
        }
    }

    public UserProfilePresenter(com.bytedance.android.livesdk.ui.a aVar, DataChannel dataChannel, boolean z, m mVar) {
        l.d(aVar, "");
        l.d(dataChannel, "");
        l.d(mVar, "");
        this.f21788b = aVar;
        this.f21789c = dataChannel;
        this.f21790d = z;
        mVar.getLifecycle().a(this);
        dataChannel.a((m) aVar, z.class, (b) new b<UserProfileEvent, h.z>(this) {
            /* class com.bytedance.android.livesdk.usercard.UserProfilePresenter.AnonymousClass1 */

            static {
                Covode.recordClassIndex(12836);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // h.f.a.b
            public final /* synthetic */ h.z invoke(UserProfileEvent userProfileEvent) {
                UserProfileEvent userProfileEvent2 = userProfileEvent;
                l.d(userProfileEvent2, "");
                ((UserProfilePresenter) this.receiver).onEvent(userProfileEvent2);
                return h.z.f158842a;
            }
        });
        com.bytedance.android.livesdk.an.a.a().a(aVar, UserProfileEvent.class, dataChannel).a(new a(new b<UserProfileEvent, h.z>(this) {
            /* class com.bytedance.android.livesdk.usercard.UserProfilePresenter.AnonymousClass2 */

            static {
                Covode.recordClassIndex(12837);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // h.f.a.b
            public final /* synthetic */ h.z invoke(UserProfileEvent userProfileEvent) {
                UserProfileEvent userProfileEvent2 = userProfileEvent;
                l.d(userProfileEvent2, "");
                ((UserProfilePresenter) this.receiver).onEvent(userProfileEvent2);
                return h.z.f158842a;
            }
        }));
    }
}
