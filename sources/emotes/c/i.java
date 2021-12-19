package emotes.c;

import android.view.View;
import com.bytedance.android.live.base.model.emoji.EmoteModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.f.k;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.d;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.android.livesdk.chatroom.g.g;
import com.bytedance.android.livesdk.j.ac;
import com.bytedance.android.livesdk.widget.VHeadView;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.List;

public final class i extends b<h> {

    /* renamed from: a  reason: collision with root package name */
    private final VHeadView f157133a;

    /* renamed from: b  reason: collision with root package name */
    private final LiveTextView f157134b;

    /* renamed from: c  reason: collision with root package name */
    private final LiveTextView f157135c;

    /* renamed from: d  reason: collision with root package name */
    private final LiveTextView f157136d;

    /* renamed from: e  reason: collision with root package name */
    private final HSImageView f157137e;

    /* renamed from: f  reason: collision with root package name */
    private final EmoteModel f157138f;

    static {
        Covode.recordClassIndex(104338);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public i(View view, EmoteModel emoteModel) {
        super(view);
        l.d(view, "");
        l.d(emoteModel, "");
        this.f157138f = emoteModel;
        View findViewById = view.findViewById(R.id.bto);
        l.b(findViewById, "");
        this.f157133a = (VHeadView) findViewById;
        View findViewById2 = view.findViewById(R.id.evf);
        l.b(findViewById2, "");
        this.f157134b = (LiveTextView) findViewById2;
        View findViewById3 = view.findViewById(R.id.f8b);
        l.b(findViewById3, "");
        this.f157135c = (LiveTextView) findViewById3;
        View findViewById4 = view.findViewById(R.id.eyc);
        l.b(findViewById4, "");
        this.f157136d = (LiveTextView) findViewById4;
        View findViewById5 = view.findViewById(R.id.bwm);
        l.b(findViewById5, "");
        this.f157137e = (HSImageView) findViewById5;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, int] */
    @Override // emotes.c.b
    public final /* synthetic */ void a(h hVar, int i2) {
        l.d(hVar, "");
        Room room = (Room) DataChannelGlobal.f34575d.b(ac.class);
        if (room != null) {
            VHeadView vHeadView = this.f157133a;
            User owner = room.getOwner();
            l.b(owner, "");
            g.a(vHeadView, owner.getAvatarThumb(), this.f157133a.getWidth(), this.f157133a.getHeight(), 2131234424);
            int i3 = 0;
            this.f157134b.setText(y.a((int) R.string.en8, room.getOwner().displayId));
            LiveTextView liveTextView = this.f157136d;
            Object[] objArr = new Object[2];
            objArr[0] = room.getOwner().displayId;
            List list = (List) DataChannelGlobal.f34575d.b(d.class);
            if (list != null) {
                i3 = list.size();
            }
            objArr[1] = Integer.valueOf(i3);
            liveTextView.setText(y.a((int) R.string.en7, objArr));
            if (this.f157138f.f7391h != null) {
                k.a(this.f157137e, this.f157138f.f7391h);
            }
        }
    }
}
