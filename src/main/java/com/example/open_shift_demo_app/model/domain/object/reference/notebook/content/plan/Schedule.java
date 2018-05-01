package com.example.open_shift_demo_app.model.domain.object.reference.notebook.content.plan;

import com.example.open_shift_demo_app.model.domain.object.value.event.EndDate;
import com.example.open_shift_demo_app.model.domain.object.value.event.Location;
import com.example.open_shift_demo_app.model.domain.object.value.event.StartDate;
import lombok.Getter;

/**
 *
 * スケジュールクラス
 *
 * 予定の時間的・空間的制約を表す。
 *
 * */
public class Schedule {

    /** 開始日時 */
    @Getter
    private StartDate startDate;

    /** 終了日時 */
    @Getter
    private EndDate endDate;

    /** 場所 */
    @Getter
    private Location location;

    private Schedule(Builder builder) {
        this.startDate = builder.startDate;
        this.endDate = builder.endDate;
        this.location = builder.location;
    }

    static class Builder {
        private StartDate startDate;
        private EndDate endDate;
        private Location location;

        public Builder(){
        }

        public Builder startDateIs(StartDate startDate){
            this.startDate = startDate;
            return this;
        }
        public Builder endDateIs(EndDate endDate) {
            if (startDate == null) {
                // 開始日時が設定差入れていなかった時
            }
            this.endDate = endDate;
            return this;
        }
        public Builder locationIs(Location location) {
            this.location = location;
            return this;
        }
        Schedule build() {
            return new Schedule(this);
        }

    }



}
