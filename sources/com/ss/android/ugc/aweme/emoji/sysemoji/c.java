package com.ss.android.ugc.aweme.emoji.sysemoji;

import android.app.Activity;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.PopupWindow;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.emoji.emojiPageV2.SwipeControlledRecycleView;
import com.ss.android.ugc.aweme.emoji.sysemoji.b;
import com.zhiliaoapp.musically.R;
import h.a.n;
import h.f.b.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class c extends PopupWindow {

    /* renamed from: d  reason: collision with root package name */
    public static final a f89363d = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    b f89364a;

    /* renamed from: b  reason: collision with root package name */
    public final Activity f89365b;

    /* renamed from: c  reason: collision with root package name */
    public final SwipeControlledRecycleView f89366c;

    /* renamed from: e  reason: collision with root package name */
    private final View f89367e;

    /* renamed from: f  reason: collision with root package name */
    private final RecyclerView f89368f;

    /* renamed from: g  reason: collision with root package name */
    private final b f89369g;

    /* renamed from: h  reason: collision with root package name */
    private i f89370h;

    public interface b {
        static {
            Covode.recordClassIndex(56158);
        }

        void a(i iVar, String str);
    }

    static {
        Covode.recordClassIndex(56156);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(56157);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    /* access modifiers changed from: package-private */
    public final int a() {
        View contentView = getContentView();
        l.b(contentView, "");
        return contentView.getMeasuredWidth();
    }

    static int a(int i2) {
        int i3;
        if (i2 == -2) {
            i3 = 0;
        } else {
            i3 = 1073741824;
        }
        return View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i2), i3);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(Activity activity, SwipeControlledRecycleView swipeControlledRecycleView) {
        super(activity);
        l.d(activity, "");
        l.d(swipeControlledRecycleView, "");
        this.f89365b = activity;
        this.f89366c = swipeControlledRecycleView;
        setHeight(-2);
        setWidth(-2);
        setOutsideTouchable(false);
        setFocusable(true);
        setBackgroundDrawable(new ColorDrawable(0));
        b bVar = new b();
        this.f89369g = bVar;
        View a2 = com.a.a(LayoutInflater.from(activity), R.layout.z7, swipeControlledRecycleView, false);
        l.b(a2, "");
        this.f89367e = a2;
        View findViewById = a2.findViewById(R.id.cb4);
        l.b(findViewById, "");
        RecyclerView recyclerView = (RecyclerView) findViewById;
        this.f89368f = recyclerView;
        recyclerView.setLayoutManager(new LinearLayoutManager(0, false));
        recyclerView.b(new m(6));
        recyclerView.setAdapter(bVar);
        setContentView(a2);
    }

    public final void a(i iVar, MotionEvent motionEvent) {
        int i2;
        int i3;
        l.d(iVar, "");
        l.d(motionEvent, "");
        if (iVar.getEmojiList() != null) {
            int position = iVar.getPosition();
            i iVar2 = this.f89370h;
            if (iVar2 == null || position != iVar2.getPosition()) {
                l.d(iVar, "");
                this.f89370h = iVar;
                b bVar = this.f89369g;
                l.d(iVar, "");
                bVar.f89355a = iVar;
                bVar.f89356b = 0;
                List<b.a> a2 = bVar.a();
                List<String> emojiList = iVar.getEmojiList();
                if (!(emojiList == null || emojiList.isEmpty() || a2 == null)) {
                    a2.clear();
                    List<String> emojiList2 = iVar.getEmojiList();
                    if (emojiList2 != null) {
                        ArrayList arrayList = new ArrayList(n.a((Iterable) emojiList2, 10));
                        Iterator<T> it = emojiList2.iterator();
                        while (it.hasNext()) {
                            arrayList.add(Boolean.valueOf(a2.add(new b.a(it.next()))));
                        }
                    }
                    bVar.notifyDataSetChanged();
                }
                this.f89369g.notifyDataSetChanged();
            }
            int[] iArr = new int[2];
            this.f89367e.getLocationOnScreen(iArr);
            int i4 = iArr[0];
            if (this.f89367e.getWidth() > 0) {
                int width = this.f89367e.getWidth();
                List<String> emojiList3 = iVar.getEmojiList();
                if (emojiList3 == null) {
                    l.b();
                }
                int size = width / emojiList3.size();
                com.ss.android.ugc.aweme.im.service.m.a.b("EmojiPopUpWindow", " event.rawX  :" + motionEvent.getRawX() + " x " + i4 + " root:w " + this.f89367e.getWidth() + ' ');
                float f2 = (float) i4;
                if (motionEvent.getRawX() <= f2) {
                    i2 = 0;
                } else if (motionEvent.getRawX() >= ((float) (i4 + this.f89367e.getWidth()))) {
                    List<String> emojiList4 = iVar.getEmojiList();
                    if (emojiList4 == null) {
                        l.b();
                    }
                    i2 = emojiList4.size() - 1;
                } else {
                    float rawX = motionEvent.getRawX() - f2;
                    i2 = (int) (rawX / ((float) size));
                    com.ss.android.ugc.aweme.im.service.m.a.b("EmojiPopUpWindow", " cal  :" + size + "  left " + rawX);
                }
                b bVar2 = this.f89369g;
                if (bVar2.f89356b != i2) {
                    if (i2 >= bVar2.a().size()) {
                        i3 = bVar2.a().size() - 1;
                    } else {
                        i3 = i2;
                    }
                    bVar2.a().get(bVar2.f89356b).f89359b = false;
                    bVar2.a().get(i3).f89359b = true;
                    bVar2.f89356b = i3;
                    i iVar3 = bVar2.f89355a;
                    if (iVar3 != null) {
                        iVar3.setPreviewEmoji(bVar2.a().get(i3).f89358a);
                    }
                    bVar2.notifyDataSetChanged();
                }
                if (motionEvent.getAction() == 1) {
                    b bVar3 = this.f89364a;
                    if (bVar3 != null) {
                        List<String> emojiList5 = iVar.getEmojiList();
                        if (emojiList5 == null) {
                            l.b();
                        }
                        bVar3.a(iVar, emojiList5.get(i2));
                    }
                    dismiss();
                }
            }
        }
    }
}
