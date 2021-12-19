package com.ss.android.ugc.aweme.comment.barrage.view;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.widget.FrameLayout;
import androidx.fragment.app.e;
import androidx.lifecycle.u;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.router.OnActivityResultCallback;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.comment.CommentServiceImpl;
import com.ss.android.ugc.aweme.comment.barrage.b.f;
import com.ss.android.ugc.aweme.comment.barrage.b.g;
import com.ss.android.ugc.aweme.comment.barrage.b.h;
import com.ss.android.ugc.aweme.comment.barrage.b.i;
import com.ss.android.ugc.aweme.comment.barrage.c;
import com.ss.android.ugc.aweme.comment.barrage.cell.TaggedPeopleAvatarCell;
import com.ss.android.ugc.aweme.comment.barrage.cell.TaggedPeopleEditCell;
import com.ss.android.ugc.aweme.comment.barrage.cell.TaggedPeopleExpandCell;
import com.ss.android.ugc.aweme.comment.barrage.cell.TaggedPeopleFoldCell;
import com.ss.android.ugc.aweme.comment.services.CommentService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeStatus;
import com.ss.android.ugc.aweme.feed.model.InteractionTagInfo;
import com.ss.android.ugc.aweme.feed.model.InteractionTagInfoKt;
import com.ss.android.ugc.aweme.feed.model.InteractionTagUserInfo;
import com.zhiliaoapp.musically.R;
import h.a.n;
import h.f.b.l;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

public final class CommentTaggedPeopleView extends FrameLayout implements u<com.ss.android.ugc.aweme.arch.widgets.base.b> {

    /* renamed from: b  reason: collision with root package name */
    public static final a f71711b = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public DataCenter f71712a;

    /* renamed from: c  reason: collision with root package name */
    private final TaggedPeopleList f71713c;

    /* renamed from: d  reason: collision with root package name */
    private final TuxTextView f71714d;

    /* renamed from: e  reason: collision with root package name */
    private List<i> f71715e;

    /* renamed from: f  reason: collision with root package name */
    private Aweme f71716f;

    /* renamed from: g  reason: collision with root package name */
    private c f71717g;

    /* renamed from: h  reason: collision with root package name */
    private int f71718h;

    /* renamed from: i  reason: collision with root package name */
    private Set<String> f71719i;

    static final class b implements OnActivityResultCallback {

        /* renamed from: a  reason: collision with root package name */
        public static final b f71720a = new b();

        static {
            Covode.recordClassIndex(44111);
        }

        b() {
        }

        @Override // com.bytedance.router.OnActivityResultCallback
        public final void onActivityResult(int i2, int i3, Intent intent) {
        }
    }

    static {
        Covode.recordClassIndex(44109);
    }

    public CommentTaggedPeopleView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(44110);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    private final void a(boolean z) {
        com.ss.android.ugc.aweme.comment.util.i.a("CommentTaggedPeopleView", "CommentTaggedPeopleView: updateDataList ".concat(String.valueOf(z)));
        c cVar = this.f71717g;
        if (cVar != null) {
            cVar.setTaggedPeopleFold(z);
        }
        com.ss.android.ugc.aweme.comment.barrage.b bVar = null;
        if (!z) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(this.f71715e);
            arrayList.add(new h(this.f71712a));
            DataCenter dataCenter = this.f71712a;
            c cVar2 = this.f71717g;
            if (cVar2 != null) {
                bVar = cVar2.getMobParams();
            }
            arrayList.add(new f(dataCenter, bVar));
            this.f71713c.getState().b(arrayList);
        } else if (this.f71715e.size() > this.f71718h - 1) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.addAll(this.f71715e.subList(0, this.f71718h - 2));
            arrayList2.add(new g(this.f71715e.size(), this.f71718h, this.f71712a));
            DataCenter dataCenter2 = this.f71712a;
            c cVar3 = this.f71717g;
            if (cVar3 != null) {
                bVar = cVar3.getMobParams();
            }
            arrayList2.add(new f(dataCenter2, bVar));
            this.f71713c.getState().b(arrayList2);
        } else {
            ArrayList arrayList3 = new ArrayList();
            arrayList3.addAll(this.f71715e);
            DataCenter dataCenter3 = this.f71712a;
            c cVar4 = this.f71717g;
            if (cVar4 != null) {
                bVar = cVar4.getMobParams();
            }
            arrayList3.add(new f(dataCenter3, bVar));
            this.f71713c.getState().b(arrayList3);
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // androidx.lifecycle.u
    public final /* synthetic */ void onChanged(com.ss.android.ugc.aweme.arch.widgets.base.b bVar) {
        Object obj;
        String str;
        Integer num;
        int i2;
        InteractionTagInfo interactionTagInfo;
        AwemeStatus status;
        com.ss.android.ugc.aweme.arch.widgets.base.b bVar2 = bVar;
        StringBuilder sb = new StringBuilder("onChanged: ");
        List<InteractionTagUserInfo> list = null;
        if (bVar2 != null) {
            obj = bVar2.a();
        } else {
            obj = null;
        }
        com.ss.android.ugc.aweme.comment.util.i.a("CommentTaggedPeopleView", sb.append(obj).toString());
        if (bVar2 != null && (str = bVar2.f67014a) != null && str.hashCode() == -1771772845 && str.equals("TAGGED_PEOPLE_ACTION") && (num = (Integer) bVar2.a()) != null) {
            if (num.intValue() == 3) {
                a(true);
            } else if (num != null) {
                if (num.intValue() == 4) {
                    a(false);
                } else if (num.intValue() == 2) {
                    Context context = getContext();
                    Objects.requireNonNull(context, "null cannot be cast to non-null type android.app.Activity");
                    if ((context instanceof e) && this.f71716f != null && context != null) {
                        CommentService e2 = CommentServiceImpl.e();
                        Context context2 = getContext();
                        l.b(context2, "");
                        Aweme aweme = this.f71716f;
                        if (aweme == null || (status = aweme.getStatus()) == null) {
                            i2 = 0;
                        } else {
                            i2 = status.getPrivateStatus();
                        }
                        Aweme aweme2 = this.f71716f;
                        if (!(aweme2 == null || (interactionTagInfo = aweme2.getInteractionTagInfo()) == null)) {
                            list = interactionTagInfo.getTaggedUsers();
                        }
                        e2.a(context2, "", aweme, i2, list, b.f71720a);
                    }
                }
            }
        }
    }

    public final void a(DataCenter dataCenter, c cVar) {
        List<InteractionTagUserInfo> taggedUsers;
        List<InteractionTagUserInfo> taggedUsers2;
        l.d(cVar, "");
        InteractionTagInfo interactionTagInfo = cVar.getAweme().getInteractionTagInfo();
        if (interactionTagInfo == null || (taggedUsers = interactionTagInfo.getTaggedUsers()) == null || taggedUsers.isEmpty()) {
            setVisibility(8);
            return;
        }
        this.f71713c.setMaxLineCount(this.f71718h);
        this.f71717g = cVar;
        this.f71716f = cVar.getAweme();
        this.f71715e.clear();
        this.f71719i.clear();
        InteractionTagInfo interactionTagInfo2 = cVar.getAweme().getInteractionTagInfo();
        if (!(interactionTagInfo2 == null || (taggedUsers2 = interactionTagInfo2.getTaggedUsers()) == null)) {
            List<InteractionTagUserInfo> g2 = n.g((Collection) taggedUsers2);
            ArrayList arrayList = new ArrayList(n.a((Iterable) g2, 10));
            for (InteractionTagUserInfo interactionTagUserInfo : g2) {
                arrayList.add(new com.ss.android.ugc.aweme.comment.barrage.b.e(InteractionTagInfoKt.toUser(interactionTagUserInfo), cVar.getMobParams(), this.f71719i));
            }
            this.f71715e.addAll(n.g((Collection) arrayList));
        }
        String quantityString = getResources().getQuantityString(R.plurals.ck, this.f71715e.size());
        l.b(quantityString, "");
        this.f71714d.setText(quantityString + ':');
        this.f71712a = dataCenter;
        a(cVar.isTaggedPeopleFold());
    }

    private /* synthetic */ CommentTaggedPeopleView(Context context, AttributeSet attributeSet, byte b2) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private CommentTaggedPeopleView(Context context, AttributeSet attributeSet, char c2) {
        super(context, attributeSet, 0);
        l.d(context, "");
        MethodCollector.i(1001);
        this.f71715e = new ArrayList();
        this.f71718h = 8;
        this.f71719i = new LinkedHashSet();
        FrameLayout.inflate(context, R.layout.js, this);
        View findViewById = findViewById(R.id.ei_);
        l.b(findViewById, "");
        TuxTextView tuxTextView = (TuxTextView) findViewById;
        this.f71714d = tuxTextView;
        View findViewById2 = findViewById(R.id.eia);
        l.b(findViewById2, "");
        TaggedPeopleList taggedPeopleList = (TaggedPeopleList) findViewById2;
        this.f71713c = taggedPeopleList;
        taggedPeopleList.a(TaggedPeopleAvatarCell.class, TaggedPeopleExpandCell.class, TaggedPeopleFoldCell.class, TaggedPeopleEditCell.class);
        int a2 = com.bytedance.ies.dmt.ui.f.b.a(context);
        Resources system = Resources.getSystem();
        l.a((Object) system, "");
        int a3 = a2 - h.g.a.a(TypedValue.applyDimension(1, 21.0f, system.getDisplayMetrics()));
        Resources system2 = Resources.getSystem();
        l.a((Object) system2, "");
        int a4 = a3 - h.g.a.a(TypedValue.applyDimension(1, 52.0f, system2.getDisplayMetrics()));
        Resources system3 = Resources.getSystem();
        l.a((Object) system3, "");
        float a5 = ((float) (a4 - h.g.a.a(TypedValue.applyDimension(1, 8.0f, system3.getDisplayMetrics())))) - tuxTextView.getPaint().measureText("Tagged:");
        Resources system4 = Resources.getSystem();
        l.a((Object) system4, "");
        Resources system5 = Resources.getSystem();
        l.a((Object) system5, "");
        int a6 = h.g.a.a(TypedValue.applyDimension(1, 24.0f, system5.getDisplayMetrics()));
        Resources system6 = Resources.getSystem();
        l.a((Object) system6, "");
        this.f71718h = (int) ((((float) h.g.a.a(TypedValue.applyDimension(1, 8.0f, system4.getDisplayMetrics()))) + a5) / ((float) (a6 + h.g.a.a(TypedValue.applyDimension(1, 8.0f, system6.getDisplayMetrics())))));
        com.ss.android.ugc.aweme.comment.util.i.a("CommentTaggedPeopleView", "bindTaggedPeople  maxW:" + a5 + "  count:" + this.f71718h);
        int i2 = this.f71718h;
        Resources system7 = Resources.getSystem();
        l.a((Object) system7, "");
        taggedPeopleList.b(new d(i2, h.g.a.a(TypedValue.applyDimension(1, 8.0f, system7.getDisplayMetrics()))));
        MethodCollector.o(1001);
    }
}
