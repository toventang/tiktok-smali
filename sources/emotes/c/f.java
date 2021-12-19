package emotes.c;

import android.view.View;
import com.bytedance.android.live.design.widget.LiveButton;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;
import emotes.a.d;
import h.f.b.l;

public final class f extends b<e> {

    /* renamed from: a  reason: collision with root package name */
    public final d f157120a;

    /* renamed from: b  reason: collision with root package name */
    private final LiveButton f157121b;

    /* renamed from: c  reason: collision with root package name */
    private final LiveTextView f157122c;

    static {
        Covode.recordClassIndex(104333);
    }

    static final class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f157123a;

        static {
            Covode.recordClassIndex(104334);
        }

        a(f fVar) {
            this.f157123a = fVar;
        }

        public final void onClick(View view) {
            this.f157123a.f157120a.a("emote_preview");
            emotes.b.a.b("emote_preview");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f(View view, d dVar) {
        super(view);
        l.d(view, "");
        l.d(dVar, "");
        this.f157120a = dVar;
        View findViewById = view.findViewById(R.id.zu);
        l.b(findViewById, "");
        this.f157121b = (LiveButton) findViewById;
        View findViewById2 = view.findViewById(R.id.ezq);
        l.b(findViewById2, "");
        this.f157122c = (LiveTextView) findViewById2;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, int] */
    @Override // emotes.c.b
    public final /* synthetic */ void a(e eVar, int i2) {
        e eVar2 = eVar;
        l.d(eVar2, "");
        this.f157121b.setVisibility(0);
        if (!eVar2.f157118a) {
            this.f157121b.setEnabled(false);
            this.f157122c.setVisibility(0);
        } else {
            this.f157121b.setEnabled(true);
            this.f157122c.setVisibility(8);
        }
        if (eVar2.f157119b) {
            this.f157121b.setVisibility(8);
            this.f157122c.setVisibility(8);
        } else {
            emotes.b.a.a("emote_preview");
        }
        this.f157121b.setOnClickListener(new a(this));
    }
}
