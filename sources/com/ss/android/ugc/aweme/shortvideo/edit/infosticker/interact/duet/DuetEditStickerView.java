package com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.duet;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.DialogInterface;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.e;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.sheet.sheet.a;
import com.bytedance.tux.table.cell.TuxTextCell;
import com.bytedance.tux.table.cell.c;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.duet.d;
import com.ss.android.ugc.aweme.sticker.data.DuetStickerStruct;
import com.ss.android.ugc.aweme.sticker.data.DuetStickerUserStruct;
import com.zhiliaoapp.musically.R;
import h.a.n;
import h.f.b.l;
import h.z;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;

public final class DuetEditStickerView extends FrameLayout {

    /* renamed from: e  reason: collision with root package name */
    public static final a f127251e = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public boolean f127252a;

    /* renamed from: b  reason: collision with root package name */
    List<User> f127253b;

    /* renamed from: c  reason: collision with root package name */
    boolean f127254c;

    /* renamed from: d  reason: collision with root package name */
    public TuxTextView f127255d;

    /* renamed from: f  reason: collision with root package name */
    private ConstraintLayout f127256f;

    /* renamed from: g  reason: collision with root package name */
    private com.bytedance.tux.sheet.sheet.a f127257g;

    /* renamed from: h  reason: collision with root package name */
    private d f127258h;

    /* renamed from: i  reason: collision with root package name */
    private h.f.a.a<z> f127259i;

    /* renamed from: j  reason: collision with root package name */
    private VideoPublishEditModel f127260j;

    static {
        Covode.recordClassIndex(83469);
    }

    public DuetEditStickerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(83470);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final VideoPublishEditModel getEditModel() {
        return this.f127260j;
    }

    public final List<User> getSelectUser() {
        return this.f127253b;
    }

    public final h.f.a.a<z> getSheetDismissListener() {
        return this.f127259i;
    }

    public final boolean getTurnOnMic() {
        return this.f127254c;
    }

    public final TuxTextView getDuetTuxText() {
        TuxTextView tuxTextView = this.f127255d;
        if (tuxTextView == null) {
            l.a("duetTuxText");
        }
        return tuxTextView;
    }

    public final float getScaleValue() {
        if (((float) getMeasuredWidth()) > ((float) com.ss.android.ttve.utils.b.a(getContext())) - com.ss.android.ttve.utils.b.b(getContext(), 60.0f)) {
            return (((float) com.ss.android.ttve.utils.b.a(getContext())) - com.ss.android.ttve.utils.b.b(getContext(), 112.0f)) / ((float) getMeasuredWidth());
        }
        return 1.0f;
    }

    private final void b() {
        View a2 = com.a.a(LayoutInflater.from(getContext()), R.layout.bkm, this, false);
        Objects.requireNonNull(a2, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
        ConstraintLayout constraintLayout = (ConstraintLayout) a2;
        this.f127256f = constraintLayout;
        if (constraintLayout == null) {
            l.a("container");
        }
        View findViewById = constraintLayout.findViewById(R.id.ar0);
        l.b(findViewById, "");
        TuxTextView tuxTextView = (TuxTextView) findViewById;
        this.f127255d = tuxTextView;
        if (tuxTextView == null) {
            l.a("duetTuxText");
        }
        tuxTextView.setTypeface(com.ss.android.ugc.aweme.editSticker.text.a.b.a().c("Neon"));
        TuxTextView tuxTextView2 = this.f127255d;
        if (tuxTextView2 == null) {
            l.a("duetTuxText");
        }
        tuxTextView2.a(30.0f);
        ConstraintLayout constraintLayout2 = this.f127256f;
        if (constraintLayout2 == null) {
            l.a("container");
        }
        addView(constraintLayout2);
    }

    public final void a() {
        Activity activity;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.addAll(this.f127253b);
        this.f127258h = new d(linkedHashSet, this.f127254c, this.f127260j);
        a.C1112a a2 = new a.C1112a().a(new b(this));
        d dVar = this.f127258h;
        if (dVar == null) {
            l.a("duetRecommendFragmentContent");
        }
        com.bytedance.tux.sheet.sheet.a aVar = a2.a(dVar).f45299a;
        this.f127257g = aVar;
        if (aVar != null) {
            Context context = getContext();
            l.b(context, "");
            while (true) {
                activity = null;
                if (context != null) {
                    if (!(context instanceof Activity)) {
                        if (!(context instanceof ContextWrapper)) {
                            break;
                        }
                        context = ((ContextWrapper) context).getBaseContext();
                    } else {
                        activity = (Activity) context;
                        break;
                    }
                } else {
                    break;
                }
            }
            Objects.requireNonNull(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            aVar.show(((e) activity).getSupportFragmentManager(), "DuetSettingDialog");
        }
    }

    public final DuetStickerStruct getDuetStruct() {
        String str;
        ArrayList arrayList = new ArrayList();
        for (T t : this.f127253b) {
            l.d(t, "");
            String nickname = t.getNickname();
            l.b(nickname, "");
            String uniqueId = t.getUniqueId();
            if (uniqueId == null || uniqueId.length() == 0) {
                str = t.getShortId();
            } else {
                str = t.getUniqueId();
            }
            if (str == null || str.length() == 0) {
                if (TextUtils.isEmpty(t.getRemarkName())) {
                    str = t.getNickname();
                    if (str == null) {
                        str = "";
                    }
                } else {
                    str = t.getRemarkName();
                    if (str == null) {
                        str = "";
                    }
                }
            }
            UrlModel avatarThumb = t.getAvatarThumb();
            l.b(avatarThumb, "");
            String secUid = t.getSecUid();
            l.b(secUid, "");
            String uid = t.getUid();
            l.b(uid, "");
            arrayList.add(new DuetStickerUserStruct(nickname, str, avatarThumb, secUid, uid));
        }
        boolean z = this.f127254c;
        Context context = getContext();
        l.b(context, "");
        String string = context.getResources().getString(R.string.bef);
        l.b(string, "");
        return new DuetStickerStruct(arrayList, z, string, null, 8, null);
    }

    public final void setEditCurrentSticker(boolean z) {
        this.f127252a = z;
    }

    public final void setEditModel(VideoPublishEditModel videoPublishEditModel) {
        this.f127260j = videoPublishEditModel;
    }

    public final void setSheetDismissListener(h.f.a.a<z> aVar) {
        this.f127259i = aVar;
    }

    public final void setTurnOnMic(boolean z) {
        this.f127254c = z;
    }

    public final void setDuetTuxText(TuxTextView tuxTextView) {
        l.d(tuxTextView, "");
        this.f127255d = tuxTextView;
    }

    public final void setSelectUser(List<User> list) {
        l.d(list, "");
        this.f127253b = list;
    }

    static final class b implements DialogInterface.OnDismissListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ DuetEditStickerView f127261a;

        static {
            Covode.recordClassIndex(83471);
        }

        b(DuetEditStickerView duetEditStickerView) {
            this.f127261a = duetEditStickerView;
        }

        public final void onDismiss(DialogInterface dialogInterface) {
            l.b(dialogInterface, "");
            if (l.a(a.b.a(dialogInterface), d.b.a.f127332a)) {
                this.f127261a.a(false);
            } else {
                this.f127261a.a(true);
            }
        }
    }

    public final void a(boolean z) {
        boolean z2;
        if (z) {
            d dVar = this.f127258h;
            if (dVar == null) {
                l.a("duetRecommendFragmentContent");
            }
            this.f127253b = n.g((Collection) dVar.f127321b.f127274a);
            d dVar2 = this.f127258h;
            if (dVar2 == null) {
                l.a("duetRecommendFragmentContent");
            }
            TuxTextCell tuxTextCell = dVar2.f127323d;
            if (tuxTextCell == null) {
                l.a("useMicSwitch");
            }
            c.b accessory = tuxTextCell.getAccessory();
            if (!(accessory instanceof c.j)) {
                accessory = null;
            }
            c.e eVar = (c.e) accessory;
            if (eVar != null) {
                z2 = eVar.g();
            } else {
                z2 = false;
            }
            this.f127254c = z2;
        }
        h.f.a.a<z> aVar = this.f127259i;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DuetEditStickerView(Context context, VideoPublishEditModel videoPublishEditModel) {
        super(context);
        l.d(context, "");
        MethodCollector.i(5522);
        this.f127253b = new ArrayList();
        this.f127260j = videoPublishEditModel;
        b();
        MethodCollector.o(5522);
    }

    private /* synthetic */ DuetEditStickerView(Context context, AttributeSet attributeSet, byte b2) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private DuetEditStickerView(Context context, AttributeSet attributeSet, char c2) {
        super(context, attributeSet, 0);
        l.d(context, "");
        MethodCollector.i(5527);
        this.f127253b = new ArrayList();
        b();
        MethodCollector.o(5527);
    }
}
