package com.bytedance.android.livesdk.hashtag;

import android.view.View;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.design.widget.LiveRadioButton;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.android.live.network.e;
import com.bytedance.android.livesdk.ab.b;
import com.bytedance.android.livesdk.ap.c;
import com.bytedance.android.livesdk.j.aq;
import com.bytedance.android.livesdk.j.df;
import com.bytedance.android.livesdk.model.GameTag;
import com.bytedance.android.livesdk.model.Hashtag;
import com.bytedance.android.livesdk.util.rxutils.f;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import h.f.a.b;
import java.util.Map;

public final class l extends RecyclerView.ViewHolder {

    /* renamed from: a  reason: collision with root package name */
    final ImageView f18186a;

    /* renamed from: b  reason: collision with root package name */
    final LiveTextView f18187b;

    /* renamed from: c  reason: collision with root package name */
    final LiveRadioButton f18188c;

    static {
        Covode.recordClassIndex(10099);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public l(View view) {
        super(view);
        h.f.b.l.d(view, "");
        View findViewById = view.findViewById(R.id.ehx);
        h.f.b.l.b(findViewById, "");
        this.f18186a = (ImageView) findViewById;
        View findViewById2 = view.findViewById(R.id.eht);
        h.f.b.l.b(findViewById2, "");
        this.f18187b = (LiveTextView) findViewById2;
        View findViewById3 = view.findViewById(R.id.ei2);
        h.f.b.l.b(findViewById3, "");
        this.f18188c = (LiveRadioButton) findViewById3;
    }

    static final class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ LiveRadioButton f18189a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f18190b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ h.f.a.a f18191c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ DataChannel f18192d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ Hashtag f18193e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ b f18194f;

        static {
            Covode.recordClassIndex(10100);
        }

        a(LiveRadioButton liveRadioButton, boolean z, h.f.a.a aVar, DataChannel dataChannel, Hashtag hashtag, b bVar) {
            this.f18189a = liveRadioButton;
            this.f18190b = z;
            this.f18191c = aVar;
            this.f18192d = dataChannel;
            this.f18193e = hashtag;
            this.f18194f = bVar;
        }

        public final void onClick(View view) {
            Room room;
            long j2;
            Long l2;
            Long l3;
            if (this.f18190b) {
                this.f18189a.setChecked(true);
                this.f18191c.invoke();
                DataChannel dataChannel = this.f18192d;
                if (dataChannel != null) {
                    dataChannel.b(aq.class, this.f18193e);
                }
                this.f18194f.invoke(this.f18193e);
                return;
            }
            DataChannel dataChannel2 = this.f18192d;
            Long l4 = null;
            if (dataChannel2 != null) {
                room = (Room) dataChannel2.b(df.class);
            } else {
                room = null;
            }
            com.bytedance.android.livesdk.ap.b<Map<String, String>> bVar = com.bytedance.android.livesdk.ap.a.cN;
            h.f.b.l.b(bVar, "");
            GameTag a2 = GameTag.a.a(bVar.a());
            if (a2 == null || (l3 = a2.id) == null) {
                j2 = 0;
            } else {
                j2 = l3.longValue();
            }
            HashtagApi hashtagApi = (HashtagApi) e.a().a(HashtagApi.class);
            if (room != null) {
                l2 = Long.valueOf(room.getId());
                l4 = Long.valueOf(room.getOwnerUserId());
            } else {
                l2 = null;
            }
            hashtagApi.setHashtag(l2, l4, this.f18193e.id, Long.valueOf(j2)).a(new f()).a(new f.a.d.f(this) {
                /* class com.bytedance.android.livesdk.hashtag.l.a.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ a f18195a;

                static {
                    Covode.recordClassIndex(10101);
                }

                {
                    this.f18195a = r1;
                }

                @Override // f.a.d.f
                public final /* synthetic */ void accept(Object obj) {
                    this.f18195a.f18189a.setChecked(true);
                    this.f18195a.f18191c.invoke();
                    DataChannel dataChannel = this.f18195a.f18192d;
                    if (dataChannel != null) {
                        dataChannel.b(aq.class, this.f18195a.f18193e);
                    }
                    com.bytedance.android.livesdk.ap.b<Long> bVar = com.bytedance.android.livesdk.ap.a.cx;
                    h.f.b.l.b(bVar, "");
                    c.a(bVar, this.f18195a.f18193e.id);
                    com.bytedance.android.livesdk.ap.b<String> bVar2 = com.bytedance.android.livesdk.ap.a.cy;
                    h.f.b.l.b(bVar2, "");
                    c.a(bVar2, this.f18195a.f18193e.title);
                    this.f18195a.f18194f.invoke(this.f18195a.f18193e);
                    com.bytedance.android.livesdk.ab.c.a(b.a.a("livesdk_anchor_more_topic_choose").a(this.f18195a.f18192d).b("live_take"), this.f18195a.f18192d).b();
                }
            }, new f.a.d.f(this) {
                /* class com.bytedance.android.livesdk.hashtag.l.a.AnonymousClass2 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ a f18196a;

                static {
                    Covode.recordClassIndex(10102);
                }

                {
                    this.f18196a = r1;
                }

                @Override // f.a.d.f
                public final /* synthetic */ void accept(Object obj) {
                    com.bytedance.android.live.core.c.a.a(6, "HashtagAnchorDialog", "failed to set topics!");
                    this.f18196a.f18194f.invoke(this.f18196a.f18193e);
                }
            });
        }
    }
}
