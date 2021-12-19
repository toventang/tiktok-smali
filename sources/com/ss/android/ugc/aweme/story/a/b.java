package com.ss.android.ugc.aweme.story.a;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.button.TuxButton;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.base.ui.SmartAvatarImageView;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class b extends ConstraintLayout {

    /* renamed from: g  reason: collision with root package name */
    public static final a f136712g = new a((byte) 0);

    /* renamed from: h  reason: collision with root package name */
    private final TuxIconView f136713h;

    /* renamed from: i  reason: collision with root package name */
    private final TuxButton f136714i;

    /* renamed from: j  reason: collision with root package name */
    private final SmartAvatarImageView f136715j;

    /* renamed from: k  reason: collision with root package name */
    private final View f136716k;

    /* renamed from: l  reason: collision with root package name */
    private final View f136717l;

    static {
        Covode.recordClassIndex(89296);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(89297);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final SmartAvatarImageView getAvatarView() {
        return this.f136715j;
    }

    public final TuxIconView getCloseBtn() {
        return this.f136713h;
    }

    public final TuxButton getCreateBtn() {
        return this.f136714i;
    }

    public final View getTutorialV5View() {
        return this.f136717l;
    }

    public final View getTutorialView() {
        return this.f136716k;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private b(Context context) {
        super(context, null, 0);
        l.d(context, "");
        MethodCollector.i(5080);
        View inflate = LayoutInflater.from(context).inflate(R.layout.b2c, this);
        View findViewById = inflate.findViewById(R.id.eca);
        l.b(findViewById, "");
        this.f136713h = (TuxIconView) findViewById;
        View findViewById2 = inflate.findViewById(R.id.agy);
        l.b(findViewById2, "");
        this.f136714i = (TuxButton) findViewById2;
        View findViewById3 = inflate.findViewById(R.id.ec_);
        l.b(findViewById3, "");
        this.f136715j = (SmartAvatarImageView) findViewById3;
        View findViewById4 = inflate.findViewById(R.id.ec9);
        l.b(findViewById4, "");
        this.f136716k = findViewById4;
        View findViewById5 = inflate.findViewById(R.id.ecf);
        l.b(findViewById5, "");
        this.f136717l = findViewById5;
        MethodCollector.o(5080);
    }

    public /* synthetic */ b(Context context, byte b2) {
        this(context);
    }
}
