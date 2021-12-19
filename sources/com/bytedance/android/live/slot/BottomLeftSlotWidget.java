package com.bytedance.android.live.slot;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.e;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import androidx.lifecycle.u;
import com.airbnb.lottie.LottieAnimationView;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.android.live.slot.IIconSlot;
import com.bytedance.android.live.t.a;
import com.bytedance.android.livesdk.j.ea;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.ss.android.ugc.aweme.au;
import com.zhiliaoapp.musically.R;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.PriorityBlockingQueue;

public class BottomLeftSlotWidget extends LiveRecyclableWidget implements IIconSlot.a, WeakHandler.IHandler, au {

    /* renamed from: a  reason: collision with root package name */
    ImageView f12614a;

    /* renamed from: b  reason: collision with root package name */
    public View f12615b;

    /* renamed from: c  reason: collision with root package name */
    public TextView f12616c;

    /* renamed from: d  reason: collision with root package name */
    public ImageView f12617d;

    /* renamed from: e  reason: collision with root package name */
    LiveTextView f12618e;

    /* renamed from: f  reason: collision with root package name */
    LottieAnimationView f12619f;

    /* renamed from: g  reason: collision with root package name */
    public Queue<ah> f12620g;

    /* renamed from: h  reason: collision with root package name */
    public Map<ah, IIconSlot.SlotViewModel> f12621h;

    /* renamed from: i  reason: collision with root package name */
    private w f12622i;

    /* renamed from: j  reason: collision with root package name */
    private IIconSlot.SlotViewModel f12623j;

    /* renamed from: k  reason: collision with root package name */
    private IIconSlot.c f12624k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f12625l;

    static {
        Covode.recordClassIndex(7036);
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public void handleMsg(Message message) {
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.k, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    public final void a() {
        this.f12617d.setVisibility(8);
        this.f12616c.setVisibility(8);
        this.f12615b.setVisibility(8);
    }

    @Override // com.bytedance.android.widget.Widget
    public int getLayoutId() {
        boolean z;
        if (this.dataChannel == null || !Boolean.TRUE.equals(this.dataChannel.b(ea.class))) {
            z = false;
        } else {
            z = true;
        }
        this.f12625l = z;
        if (z) {
            return R.layout.bga;
        }
        return R.layout.bg_;
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public void onUnload() {
        IIconSlot.SlotViewModel slotViewModel = this.f12623j;
        if (slotViewModel != null) {
            slotViewModel.a(this);
        }
        Queue<ah> queue = this.f12620g;
        if (queue != null) {
            queue.clear();
        }
        Map<ah, IIconSlot.SlotViewModel> map = this.f12621h;
        if (map != null) {
            for (IIconSlot.SlotViewModel slotViewModel2 : map.values()) {
                slotViewModel2.a(this);
            }
            this.f12621h.clear();
        }
        this.f12622i.onDestroy();
        getLifecycle().b(this.f12622i);
    }

    @Override // com.bytedance.android.live.slot.IIconSlot.a
    public final void a(IIconSlot.c cVar) {
        this.f12624k = cVar;
    }

    public final void a(boolean z) {
        if (z) {
            show();
        } else {
            hide();
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public void onInit(Object[] objArr) {
        this.f12614a = (ImageView) findViewById(R.id.enn);
        this.f12616c = (TextView) findViewById(R.id.enh);
        this.f12617d = (ImageView) findViewById(R.id.eng);
        this.f12615b = findViewById(R.id.enk);
        this.f12619f = (LottieAnimationView) findViewById(R.id.eni);
        if (this.f12625l) {
            this.f12618e = (LiveTextView) findViewById(R.id.enr);
        }
        hide();
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public void onLoad(Object[] objArr) {
        w createIconSlotController = ((ISlotService) a.a(ISlotService.class)).createIconSlotController((e) getContext(), this, IIconSlot.b.SLOT_LIVE_WATCHER_TOOLBAR, IIconSlot.c.PRIORITY);
        this.f12622i = createIconSlotController;
        createIconSlotController.a(this.dataChannel);
        this.f12622i.a((e) getContext(), IIconSlot.b.SLOT_LIVE_WATCHER_TOOLBAR);
        this.f12620g = new PriorityBlockingQueue(3, new Comparator<ah>() {
            /* class com.bytedance.android.live.slot.BottomLeftSlotWidget.AnonymousClass1 */

            static {
                Covode.recordClassIndex(7037);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
            @Override // java.util.Comparator
            public final /* bridge */ /* synthetic */ int compare(ah ahVar, ah ahVar2) {
                return ahVar.f12757a - ahVar2.f12757a;
            }
        });
        this.f12621h = new HashMap();
        getLifecycle().a(this.f12622i);
    }

    public final void a(Drawable drawable, Drawable drawable2) {
        if (!this.f12625l || drawable2 == null) {
            this.f12614a.setImageDrawable(drawable);
        } else {
            this.f12614a.setImageDrawable(drawable2);
        }
    }

    public final void a(final IIconSlot iIconSlot, final IIconSlot.SlotViewModel slotViewModel) {
        slotViewModel.f12720h.observe(this, new u<Drawable>() {
            /* class com.bytedance.android.live.slot.BottomLeftSlotWidget.AnonymousClass5 */

            static {
                Covode.recordClassIndex(7043);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // androidx.lifecycle.u
            public final /* synthetic */ void onChanged(Drawable drawable) {
                int i2;
                Drawable drawable2 = drawable;
                if (Boolean.TRUE.equals(slotViewModel.f12713a.getValue())) {
                    BottomLeftSlotWidget.this.a();
                    ImageView imageView = BottomLeftSlotWidget.this.f12617d;
                    if (drawable2 == null) {
                        i2 = 8;
                    } else {
                        i2 = 0;
                    }
                    imageView.setVisibility(i2);
                    BottomLeftSlotWidget.this.f12617d.setImageDrawable(drawable2);
                }
            }
        });
        slotViewModel.f12716d.observe(this, new u<Boolean>() {
            /* class com.bytedance.android.live.slot.BottomLeftSlotWidget.AnonymousClass6 */

            static {
                Covode.recordClassIndex(7044);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // androidx.lifecycle.u
            public final /* synthetic */ void onChanged(Boolean bool) {
                Boolean bool2 = bool;
                if (Boolean.TRUE.equals(slotViewModel.f12713a.getValue())) {
                    int i2 = 0;
                    if (bool2 == null) {
                        bool2 = false;
                    }
                    if (slotViewModel.f12720h.getValue() == null && TextUtils.isEmpty(slotViewModel.f12715c.getValue())) {
                        BottomLeftSlotWidget.this.a();
                        View view = BottomLeftSlotWidget.this.f12615b;
                        if (!bool2.booleanValue()) {
                            i2 = 8;
                        }
                        view.setVisibility(i2);
                    }
                }
            }
        });
        slotViewModel.f12715c.observe(this, new u<String>() {
            /* class com.bytedance.android.live.slot.BottomLeftSlotWidget.AnonymousClass7 */

            static {
                Covode.recordClassIndex(7045);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // androidx.lifecycle.u
            public final /* synthetic */ void onChanged(String str) {
                int i2;
                String str2 = str;
                if (Boolean.TRUE.equals(slotViewModel.f12713a.getValue()) && slotViewModel.f12720h.getValue() == null) {
                    BottomLeftSlotWidget.this.a();
                    TextView textView = BottomLeftSlotWidget.this.f12616c;
                    if (TextUtils.isEmpty(str2)) {
                        i2 = 8;
                    } else {
                        i2 = 0;
                    }
                    textView.setVisibility(i2);
                    BottomLeftSlotWidget.this.f12616c.setText(str2);
                }
            }
        });
        slotViewModel.f12717e.observe(this, new u<Drawable>() {
            /* class com.bytedance.android.live.slot.BottomLeftSlotWidget.AnonymousClass8 */

            static {
                Covode.recordClassIndex(7046);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // androidx.lifecycle.u
            public final /* synthetic */ void onChanged(Drawable drawable) {
                Drawable drawable2 = drawable;
                if (Boolean.TRUE.equals(slotViewModel.f12713a.getValue())) {
                    BottomLeftSlotWidget.this.a(drawable2, slotViewModel.f12718f.getValue());
                }
            }
        });
        slotViewModel.f12718f.observe(this, new u<Drawable>() {
            /* class com.bytedance.android.live.slot.BottomLeftSlotWidget.AnonymousClass9 */

            static {
                Covode.recordClassIndex(7047);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // androidx.lifecycle.u
            public final /* synthetic */ void onChanged(Drawable drawable) {
                Drawable drawable2 = drawable;
                if (Boolean.TRUE.equals(slotViewModel.f12713a.getValue())) {
                    BottomLeftSlotWidget.this.a(slotViewModel.f12717e.getValue(), drawable2);
                }
            }
        });
        slotViewModel.f12724l.observe(this, new f(this, slotViewModel, iIconSlot));
        if (this.f12625l) {
            slotViewModel.f12721i.observe(this, new g(this, slotViewModel));
        }
        getView().setOnClickListener(new View.OnClickListener() {
            /* class com.bytedance.android.live.slot.BottomLeftSlotWidget.AnonymousClass10 */

            static {
                Covode.recordClassIndex(7038);
            }

            public final void onClick(View view) {
                ae a2 = iIconSlot.a();
                if (a2 != null) {
                    a2.a(BottomLeftSlotWidget.this.getView(), "during_live");
                } else if (!TextUtils.isEmpty(null)) {
                    ((IActionHandlerService) a.a(IActionHandlerService.class)).handleWithoutHost(BottomLeftSlotWidget.this.context, Uri.parse(null).toString());
                }
            }
        });
    }

    @Override // com.bytedance.android.live.slot.IIconSlot.a
    public final void a(final ab abVar, final IIconSlot.SlotViewModel slotViewModel) {
        this.f12623j = slotViewModel;
        if (slotViewModel != null && getView() != null) {
            this.f12623j.f12713a.postValue(true);
            slotViewModel.f12714b.observe(this, new u<Boolean>() {
                /* class com.bytedance.android.live.slot.BottomLeftSlotWidget.AnonymousClass4 */

                static {
                    Covode.recordClassIndex(7042);
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // androidx.lifecycle.u
                public final /* synthetic */ void onChanged(Boolean bool) {
                    String str;
                    Boolean bool2 = bool;
                    if (Boolean.TRUE.equals(slotViewModel.f12713a.getValue())) {
                        BottomLeftSlotWidget.this.a(bool2.booleanValue());
                        if (Boolean.TRUE.equals(bool2)) {
                            abVar.a("during_live");
                        }
                        if (Boolean.TRUE.equals(bool2)) {
                            str = abVar.g();
                        } else {
                            str = "";
                        }
                        ac.a(str);
                    }
                }
            });
            a((IIconSlot) abVar.f(), slotViewModel);
        }
    }

    @Override // com.bytedance.android.live.slot.IIconSlot.a
    public final void a(final ah ahVar, final IIconSlot.SlotViewModel slotViewModel) {
        this.f12620g.add(ahVar);
        this.f12621h.put(ahVar, slotViewModel);
        if (this.f12624k == IIconSlot.c.FIRST) {
            slotViewModel.f12714b.observe(this, new u<Boolean>() {
                /* class com.bytedance.android.live.slot.BottomLeftSlotWidget.AnonymousClass11 */

                static {
                    Covode.recordClassIndex(7039);
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // androidx.lifecycle.u
                public final /* synthetic */ void onChanged(Boolean bool) {
                    Boolean bool2 = bool;
                    String str = "";
                    if (Boolean.TRUE.equals(slotViewModel.f12713a.getValue())) {
                        BottomLeftSlotWidget.this.a(bool2.booleanValue());
                        if (Boolean.TRUE.equals(bool2)) {
                            ahVar.f12758b.a("during_live");
                        }
                        if (Boolean.TRUE.equals(bool2)) {
                            str = ahVar.f12758b.g();
                        }
                        ac.a(str);
                        return;
                    }
                    Iterator<ah> it = BottomLeftSlotWidget.this.f12620g.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            slotViewModel.f12713a.setValue(true);
                            break;
                        }
                        ah next = it.next();
                        IIconSlot.SlotViewModel slotViewModel = BottomLeftSlotWidget.this.f12621h.get(next);
                        if (ahVar != next && Boolean.TRUE.equals(slotViewModel.f12713a.getValue())) {
                            break;
                        }
                    }
                    if (Boolean.TRUE.equals(slotViewModel.f12713a.getValue())) {
                        BottomLeftSlotWidget.this.a(bool2.booleanValue());
                        if (Boolean.TRUE.equals(bool2)) {
                            ahVar.f12758b.a("during_live");
                        }
                        if (Boolean.TRUE.equals(bool2)) {
                            str = ahVar.f12758b.g();
                        }
                        ac.a(str);
                    }
                }
            });
        } else if (this.f12624k == IIconSlot.c.LAST) {
            slotViewModel.f12714b.observe(this, new u<Boolean>() {
                /* class com.bytedance.android.live.slot.BottomLeftSlotWidget.AnonymousClass2 */

                static {
                    Covode.recordClassIndex(7040);
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // androidx.lifecycle.u
                public final /* synthetic */ void onChanged(Boolean bool) {
                    Boolean bool2 = bool;
                    String str = "";
                    if (Boolean.TRUE.equals(slotViewModel.f12713a.getValue())) {
                        BottomLeftSlotWidget.this.a(bool2.booleanValue());
                        if (Boolean.TRUE.equals(bool2)) {
                            ahVar.f12758b.a("during_live");
                        }
                        if (Boolean.TRUE.equals(bool2)) {
                            str = ahVar.f12758b.g();
                        }
                        ac.a(str);
                        return;
                    }
                    for (ah ahVar : BottomLeftSlotWidget.this.f12620g) {
                        IIconSlot.SlotViewModel slotViewModel = BottomLeftSlotWidget.this.f12621h.get(ahVar);
                        if (ahVar != ahVar && Boolean.TRUE.equals(slotViewModel.f12713a.getValue())) {
                            slotViewModel.f12713a.postValue(false);
                        }
                    }
                    slotViewModel.f12713a.setValue(true);
                    BottomLeftSlotWidget.this.a(bool2.booleanValue());
                    BottomLeftSlotWidget.this.a((IIconSlot) ahVar.f12758b.f(), slotViewModel);
                    if (Boolean.TRUE.equals(bool2)) {
                        ahVar.f12758b.a("during_live");
                    }
                    if (Boolean.TRUE.equals(bool2)) {
                        str = ahVar.f12758b.g();
                    }
                    ac.a(str);
                }
            });
        } else if (this.f12624k == IIconSlot.c.PRIORITY) {
            slotViewModel.f12714b.observe(this, new u<Boolean>() {
                /* class com.bytedance.android.live.slot.BottomLeftSlotWidget.AnonymousClass3 */

                static {
                    Covode.recordClassIndex(7041);
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX WARNING: Code restructure failed: missing block: B:35:0x00ff, code lost:
                    if (r7 == false) goto L_?;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:71:?, code lost:
                    return;
                 */
                @Override // androidx.lifecycle.u
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final /* synthetic */ void onChanged(java.lang.Boolean r11) {
                    /*
                    // Method dump skipped, instructions count: 445
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.slot.BottomLeftSlotWidget.AnonymousClass3.onChanged(java.lang.Object):void");
                }
            });
        }
    }
}
