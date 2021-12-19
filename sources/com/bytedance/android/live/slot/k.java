package com.bytedance.android.live.slot;

import com.bytedance.android.livesdk.aq.a;
import com.bytedance.android.livesdk.aq.e;
import com.bytedance.android.livesdk.chatroom.c.s;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import f.a.d.f;

final /* synthetic */ class k implements f {

    /* renamed from: a  reason: collision with root package name */
    private final FrameL2SlotWidget f12781a;

    static {
        Covode.recordClassIndex(7107);
    }

    k(FrameL2SlotWidget frameL2SlotWidget) {
        this.f12781a = frameL2SlotWidget;
    }

    @Override // f.a.d.f
    public final void accept(Object obj) {
        FrameL2SlotWidget frameL2SlotWidget = this.f12781a;
        s sVar = (s) obj;
        frameL2SlotWidget.f12655e = sVar.f15147b;
        if (frameL2SlotWidget.getView() != null && frameL2SlotWidget.f12654d != null && frameL2SlotWidget.f12653c != null && frameL2SlotWidget.f12653c.f12709a.getValue() != null && ((Boolean) frameL2SlotWidget.f12653c.f12709a.getValue().first).booleanValue()) {
            if (sVar.f15147b) {
                frameL2SlotWidget.hide();
            } else {
                frameL2SlotWidget.show();
            }
            frameL2SlotWidget.dataChannel.b(a.class, Boolean.valueOf(!sVar.f15147b));
            frameL2SlotWidget.f12654d.post(new Runnable(sVar) {
                /* class com.bytedance.android.live.slot.FrameL2SlotWidget.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ s f12657a;

                static {
                    Covode.recordClassIndex(7049);
                }

                public final void run() {
                    int height;
                    if (FrameL2SlotWidget.this.dataChannel != null) {
                        DataChannel dataChannel = FrameL2SlotWidget.this.dataChannel;
                        if (this.f12657a.f15147b) {
                            height = 0;
                        } else {
                            height = FrameL2SlotWidget.this.f12654d.getHeight();
                        }
                        dataChannel.b(e.class, Integer.valueOf(height));
                    }
                }

                {
                    this.f12657a = r2;
                }
            });
        }
    }
}
