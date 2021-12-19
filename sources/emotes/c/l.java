package emotes.c;

import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.android.live.base.model.emoji.EmoteModel;
import com.bytedance.android.live.core.f.k;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;
import emotes.a.c;

public final class l extends b<EmoteModel> {

    /* renamed from: a  reason: collision with root package name */
    public e.c.a f157143a;

    /* renamed from: b  reason: collision with root package name */
    public c f157144b;

    /* renamed from: c  reason: collision with root package name */
    private final HSImageView f157145c;

    static {
        Covode.recordClassIndex(104341);
    }

    static final class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ l f157146a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ EmoteModel f157147b;

        static {
            Covode.recordClassIndex(104342);
        }

        a(l lVar, EmoteModel emoteModel) {
            this.f157146a = lVar;
            this.f157147b = emoteModel;
        }

        public final void onClick(View view) {
            e.c.a aVar;
            if (!this.f157147b.f7394k && (aVar = this.f157146a.f157143a) != null) {
                aVar.a(this.f157147b);
            }
        }
    }

    static final class b implements View.OnTouchListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ l f157148a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ EmoteModel f157149b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f157150c;

        static {
            Covode.recordClassIndex(104343);
        }

        b(l lVar, EmoteModel emoteModel, int i2) {
            this.f157148a = lVar;
            this.f157149b = emoteModel;
            this.f157150c = i2;
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            c cVar;
            if (this.f157149b.f7394k || (cVar = this.f157148a.f157144b) == null) {
                return false;
            }
            h.f.b.l.b(view, "");
            h.f.b.l.b(motionEvent, "");
            return cVar.a(view, motionEvent, this.f157150c, this.f157149b);
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, int] */
    @Override // emotes.c.b
    public final /* synthetic */ void a(EmoteModel emoteModel, int i2) {
        EmoteModel emoteModel2 = emoteModel;
        h.f.b.l.d(emoteModel2, "");
        if (emoteModel2.f7391h != null) {
            k.a(this.f157145c, emoteModel2.f7391h);
        }
        if (emoteModel2.f7394k || !emoteModel2.f7395l) {
            this.f157145c.setColorFilter((ColorFilter) null);
        } else {
            this.f157145c.setColorFilter(Color.parseColor("#57ffffff"), PorterDuff.Mode.SRC_ATOP);
        }
        this.itemView.setOnClickListener(new a(this, emoteModel2));
        this.itemView.setOnTouchListener(new b(this, emoteModel2, i2));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public l(View view, e.c.a aVar, c cVar) {
        super(view);
        h.f.b.l.d(view, "");
        this.f157143a = aVar;
        this.f157144b = cVar;
        View findViewById = view.findViewById(R.id.bwm);
        h.f.b.l.b(findViewById, "");
        this.f157145c = (HSImageView) findViewById;
    }
}
