package emotes.c;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.live.design.widget.LiveButton;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.android.livesdk.j.ac;
import com.bytedance.android.livesdk.widget.VHeadView;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.zhiliaoapp.musically.R;
import emotes.a.d;
import h.f.b.l;
import java.util.List;

public final class g extends b<h> {

    /* renamed from: a  reason: collision with root package name */
    public final d f157124a;

    /* renamed from: b  reason: collision with root package name */
    private final LiveTextView f157125b;

    /* renamed from: c  reason: collision with root package name */
    private final VHeadView f157126c;

    /* renamed from: d  reason: collision with root package name */
    private final LiveTextView f157127d;

    /* renamed from: e  reason: collision with root package name */
    private final LiveTextView f157128e;

    /* renamed from: f  reason: collision with root package name */
    private final LiveButton f157129f;

    static {
        Covode.recordClassIndex(104335);
    }

    static final class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f157130a;

        static {
            Covode.recordClassIndex(104336);
        }

        a(g gVar) {
            this.f157130a = gVar;
        }

        public final void onClick(View view) {
            this.f157130a.f157124a.a("emote_bar");
            emotes.b.a.b("emote_bar");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g(View view, d dVar) {
        super(view);
        l.d(view, "");
        l.d(dVar, "");
        this.f157124a = dVar;
        View findViewById = view.findViewById(R.id.ezq);
        l.b(findViewById, "");
        this.f157125b = (LiveTextView) findViewById;
        View findViewById2 = view.findViewById(R.id.bxq);
        l.b(findViewById2, "");
        this.f157126c = (VHeadView) findViewById2;
        View findViewById3 = view.findViewById(R.id.f_b);
        l.b(findViewById3, "");
        this.f157127d = (LiveTextView) findViewById3;
        View findViewById4 = view.findViewById(R.id.eye);
        l.b(findViewById4, "");
        this.f157128e = (LiveTextView) findViewById4;
        View findViewById5 = view.findViewById(R.id.zu);
        l.b(findViewById5, "");
        this.f157129f = (LiveButton) findViewById5;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, int] */
    @Override // emotes.c.b
    public final /* synthetic */ void a(h hVar, int i2) {
        int i3;
        int i4;
        h hVar2 = hVar;
        l.d(hVar2, "");
        Room room = (Room) DataChannelGlobal.f34575d.b(ac.class);
        if (room != null) {
            VHeadView vHeadView = this.f157126c;
            User owner = room.getOwner();
            l.b(owner, "");
            com.bytedance.android.livesdk.chatroom.g.g.a(vHeadView, owner.getAvatarThumb(), this.f157126c.getWidth(), this.f157126c.getHeight(), 2131234424);
            ViewGroup.LayoutParams layoutParams = this.f157125b.getLayoutParams();
            layoutParams.width = y.c();
            this.f157125b.setLayoutParams(layoutParams);
            this.f157127d.setText(room.getOwner().displayId);
            LiveTextView liveTextView = this.f157128e;
            Context context = liveTextView.getContext();
            l.b(context, "");
            Resources resources = context.getResources();
            List list = (List) DataChannelGlobal.f34575d.b(com.bytedance.android.live.d.class);
            if (list != null) {
                i3 = list.size();
            } else {
                i3 = 0;
            }
            Object[] objArr = new Object[2];
            objArr[0] = room.getOwner().displayId;
            List list2 = (List) DataChannelGlobal.f34575d.b(com.bytedance.android.live.d.class);
            if (list2 != null) {
                i4 = list2.size();
            } else {
                i4 = 0;
            }
            objArr[1] = Integer.valueOf(i4);
            liveTextView.setText(resources.getQuantityString(R.plurals.gk, i3, objArr));
            if (!hVar2.f157132b) {
                this.f157129f.setEnabled(true);
                this.f157129f.setVisibility(0);
            }
            if (!hVar2.f157131a) {
                this.f157125b.setVisibility(0);
                this.f157129f.setEnabled(false);
            } else {
                this.f157125b.setVisibility(8);
                this.f157129f.setEnabled(true);
            }
            this.f157129f.setOnClickListener(new a(this));
        }
    }
}
