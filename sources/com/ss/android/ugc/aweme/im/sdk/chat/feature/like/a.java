package com.ss.android.ugc.aweme.im.sdk.chat.feature.like;

import android.text.TextUtils;
import android.view.View;
import androidx.lifecycle.m;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.im.core.api.b.a;
import com.bytedance.im.core.d.ai;
import com.bytedance.im.core.d.h;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.a.c;
import h.f.b.l;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final m f100868a;

    /* renamed from: b  reason: collision with root package name */
    public final View f100869b;

    /* renamed from: c  reason: collision with root package name */
    public final RecyclerView f100870c;

    /* renamed from: d  reason: collision with root package name */
    public final c f100871d;

    /* renamed from: e  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.im.sdk.chat.feature.single.a.a f100872e;

    static {
        Covode.recordClassIndex(64529);
    }

    public a(m mVar, View view, RecyclerView recyclerView, c cVar, com.ss.android.ugc.aweme.im.sdk.chat.feature.single.a.a aVar) {
        l.d(mVar, "");
        l.d(view, "");
        l.d(recyclerView, "");
        l.d(cVar, "");
        l.d(aVar, "");
        this.f100868a = mVar;
        this.f100869b = view;
        this.f100870c = recyclerView;
        this.f100871d = cVar;
        this.f100872e = aVar;
        cVar.a(new c.b(this) {
            /* class com.ss.android.ugc.aweme.im.sdk.chat.feature.like.a.AnonymousClass1 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ a f100873a;

            static {
                Covode.recordClassIndex(64530);
            }

            {
                this.f100873a = r1;
            }

            /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.like.a$1$a  reason: collision with other inner class name */
            static final class RunnableC2498a implements Runnable {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ int f100874a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ AnonymousClass1 f100875b;

                static {
                    Covode.recordClassIndex(64531);
                }

                RunnableC2498a(int i2, AnonymousClass1 r2) {
                    this.f100874a = i2;
                    this.f100875b = r2;
                }

                public final void run() {
                    this.f100875b.f100873a.f100870c.d(this.f100874a);
                }
            }

            @Override // com.ss.android.ugc.aweme.im.sdk.chat.ui.a.c.b
            public final void a() {
                Integer num;
                String message_id;
                h a2 = a.C0745a.a().a(this.f100873a.f100871d.n.getConversationId());
                if (a2 != null) {
                    if (this.f100873a.f100872e.getUnreadCount() == 0 && com.ss.android.ugc.aweme.im.sdk.chatlist.controller.helper.c.a(a2)) {
                        com.ss.android.ugc.aweme.im.sdk.chatlist.b.a c2 = com.ss.android.ugc.aweme.im.sdk.chatlist.controller.helper.c.c(a2);
                        if (c2 != null) {
                            num = c2.getMark_read();
                        } else {
                            num = null;
                        }
                        if (num != null && num.intValue() == 1) {
                            com.ss.android.ugc.aweme.im.service.m.a.c("DmHelper", "DmLikeLocateDelegate->not locate cause mark_read");
                            return;
                        } else if (c2 != null && (message_id = c2.getMessage_id()) != null) {
                            c cVar = this.f100873a.f100871d;
                            if (cVar.f101101b != null && !cVar.f101101b.isEmpty()) {
                                int min = Math.min(cVar.f101101b.size(), 20);
                                int i2 = 0;
                                while (true) {
                                    if (i2 >= min) {
                                        break;
                                    } else if (TextUtils.equals(((ai) cVar.f101101b.get(i2)).getUuid(), message_id)) {
                                        com.ss.android.ugc.aweme.im.service.m.a.c("MessageAdapter", "findMsgByMsgUUid get for index:".concat(String.valueOf(i2)));
                                        if (i2 != -1) {
                                            com.ss.android.ugc.aweme.im.service.m.a.c("DmHelper", "DmLikeLocateDelegate->locate:".concat(String.valueOf(i2)));
                                            this.f100873a.f100870c.post(new RunnableC2498a(i2, this));
                                        }
                                    } else {
                                        i2++;
                                    }
                                }
                            }
                        }
                    }
                    com.ss.android.ugc.aweme.im.sdk.chatlist.controller.helper.c.e(a2);
                }
            }
        });
    }
}
