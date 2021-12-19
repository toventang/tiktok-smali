package com.bytedance.android.live.liveinteract.platform.a.b;

import com.bytedance.android.live.liveinteract.api.c.f;
import com.bytedance.android.livesdk.model.message.aj;
import com.bytedance.android.livesdk.model.message.ar;
import com.bytedance.android.livesdk.model.message.as;
import com.bytedance.android.livesdk.model.message.at;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import h.f.b.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@f(a = "LINK_MESSAGE_CENTER")
public final class g implements OnMessageListener {

    /* renamed from: a  reason: collision with root package name */
    public final DataChannel f11871a;

    /* renamed from: b  reason: collision with root package name */
    private final List<e> f11872b = new ArrayList();

    static {
        Covode.recordClassIndex(6479);
    }

    public final void a(e eVar) {
        l.d(eVar, "");
        this.f11872b.add(eVar);
    }

    public g(DataChannel dataChannel) {
        l.d(dataChannel, "");
        this.f11871a = dataChannel;
    }

    public final void b(e eVar) {
        l.d(eVar, "");
        if (this.f11872b.contains(eVar)) {
            this.f11872b.remove(eVar);
        }
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        String str;
        if (iMessage != null) {
            if (iMessage instanceof ar) {
                int i2 = ((ar) iMessage).f19190a;
                if (i2 == 8) {
                    List<e> list = this.f11872b;
                    ArrayList arrayList = new ArrayList();
                    for (T t : list) {
                        if (t instanceof b) {
                            arrayList.add(t);
                        }
                    }
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        it.next();
                    }
                } else if (i2 == 105) {
                    List<e> list2 = this.f11872b;
                    ArrayList<b> arrayList2 = new ArrayList();
                    for (T t2 : list2) {
                        if (t2 instanceof b) {
                            arrayList2.add(t2);
                        }
                    }
                    for (b bVar : arrayList2) {
                        bVar.a();
                    }
                }
            } else if (iMessage instanceof at) {
                at atVar = (at) iMessage;
                as c2 = atVar.c();
                Long l2 = null;
                String str2 = c2 != null ? c2.f19203e : null;
                as c3 = atVar.c();
                Integer valueOf = c3 != null ? Integer.valueOf(c3.f19205g) : null;
                try {
                    as c4 = ((at) iMessage).c();
                    if (!(c4 == null || (str = c4.f19202d) == null)) {
                        l2 = Long.valueOf(Long.parseLong(str));
                    }
                    if (str2 == null) {
                        throw new IllegalStateException("Required value was null.".toString());
                    } else if (valueOf == null) {
                        throw new IllegalStateException("Required value was null.".toString());
                    } else if (l2 != null) {
                        List<e> list3 = this.f11872b;
                        ArrayList<d> arrayList3 = new ArrayList();
                        for (T t3 : list3) {
                            if (t3 instanceof d) {
                                arrayList3.add(t3);
                            }
                        }
                        for (d dVar : arrayList3) {
                            dVar.c(l2.longValue(), valueOf.intValue());
                        }
                    } else {
                        throw new IllegalStateException("Required value was null.".toString());
                    }
                } catch (Exception unused) {
                }
            } else if (iMessage instanceof aj) {
                aj ajVar = (aj) iMessage;
                switch (ajVar.f19139a) {
                    case 2:
                        List<e> list4 = this.f11872b;
                        ArrayList<c> arrayList4 = new ArrayList();
                        for (T t4 : list4) {
                            if (t4 instanceof c) {
                                arrayList4.add(t4);
                            }
                        }
                        for (c cVar : arrayList4) {
                            cVar.a(ajVar);
                        }
                        return;
                    case 3:
                        List<e> list5 = this.f11872b;
                        ArrayList<c> arrayList5 = new ArrayList();
                        for (T t5 : list5) {
                            if (t5 instanceof c) {
                                arrayList5.add(t5);
                            }
                        }
                        for (c cVar2 : arrayList5) {
                            cVar2.b(ajVar);
                        }
                        return;
                    case 4:
                        List<e> list6 = this.f11872b;
                        ArrayList<c> arrayList6 = new ArrayList();
                        for (T t6 : list6) {
                            if (t6 instanceof c) {
                                arrayList6.add(t6);
                            }
                        }
                        for (c cVar3 : arrayList6) {
                            cVar3.i(ajVar);
                        }
                        return;
                    case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                        List<e> list7 = this.f11872b;
                        ArrayList<c> arrayList7 = new ArrayList();
                        for (T t7 : list7) {
                            if (t7 instanceof c) {
                                arrayList7.add(t7);
                            }
                        }
                        for (c cVar4 : arrayList7) {
                            cVar4.c(ajVar);
                        }
                        return;
                    case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                        List<e> list8 = this.f11872b;
                        ArrayList<f> arrayList8 = new ArrayList();
                        for (T t8 : list8) {
                            if (t8 instanceof f) {
                                arrayList8.add(t8);
                            }
                        }
                        for (f fVar : arrayList8) {
                            fVar.e(ajVar);
                        }
                        return;
                    case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY /*{ENCODED_INT: 7}*/:
                        List<e> list9 = this.f11872b;
                        ArrayList<f> arrayList9 = new ArrayList();
                        for (T t9 : list9) {
                            if (t9 instanceof f) {
                                arrayList9.add(t9);
                            }
                        }
                        for (f fVar2 : arrayList9) {
                            fVar2.m(ajVar);
                        }
                        return;
                    case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 8}*/:
                        List<e> list10 = this.f11872b;
                        ArrayList<c> arrayList10 = new ArrayList();
                        for (T t10 : list10) {
                            if (t10 instanceof c) {
                                arrayList10.add(t10);
                            }
                        }
                        for (c cVar5 : arrayList10) {
                            cVar5.k(ajVar);
                        }
                        return;
                    case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 9}*/:
                        List<e> list11 = this.f11872b;
                        ArrayList<c> arrayList11 = new ArrayList();
                        for (T t11 : list11) {
                            if (t11 instanceof c) {
                                arrayList11.add(t11);
                            }
                        }
                        for (c cVar6 : arrayList11) {
                            cVar6.d(ajVar);
                        }
                        return;
                    case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 10}*/:
                        List<e> list12 = this.f11872b;
                        ArrayList<f> arrayList12 = new ArrayList();
                        for (T t12 : list12) {
                            if (t12 instanceof f) {
                                arrayList12.add(t12);
                            }
                        }
                        for (f fVar3 : arrayList12) {
                            fVar3.l(ajVar);
                        }
                        return;
                    case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 11}*/:
                        List<e> list13 = this.f11872b;
                        ArrayList<f> arrayList13 = new ArrayList();
                        for (T t13 : list13) {
                            if (t13 instanceof f) {
                                arrayList13.add(t13);
                            }
                        }
                        for (f fVar4 : arrayList13) {
                            fVar4.f(ajVar);
                        }
                        return;
                    case ABRConfig.ABR_DEFAULT_WIFI_BITRATE /*{ENCODED_INT: 12}*/:
                    case 15:
                    case 16:
                    default:
                        return;
                    case ABRConfig.ABR_STARTUP_MAX_BITRATE /*{ENCODED_INT: 13}*/:
                        List<e> list14 = this.f11872b;
                        ArrayList<c> arrayList14 = new ArrayList();
                        for (T t14 : list14) {
                            if (t14 instanceof c) {
                                arrayList14.add(t14);
                            }
                        }
                        for (c cVar7 : arrayList14) {
                            cVar7.h(ajVar);
                        }
                        return;
                    case ABRConfig.ABR_SELECT_SCENE /*{ENCODED_INT: 14}*/:
                        List<e> list15 = this.f11872b;
                        ArrayList<c> arrayList15 = new ArrayList();
                        for (T t15 : list15) {
                            if (t15 instanceof c) {
                                arrayList15.add(t15);
                            }
                        }
                        for (c cVar8 : arrayList15) {
                            cVar8.j(ajVar);
                        }
                        return;
                    case 17:
                        List<e> list16 = this.f11872b;
                        ArrayList<f> arrayList16 = new ArrayList();
                        for (T t16 : list16) {
                            if (t16 instanceof f) {
                                arrayList16.add(t16);
                            }
                        }
                        for (f fVar5 : arrayList16) {
                            fVar5.g(ajVar);
                        }
                        return;
                }
            }
        }
    }
}
