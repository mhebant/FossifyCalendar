package org.fossify.calendar.models

import org.fossify.calendar.helpers.REMINDER_ALARM
import org.fossify.calendar.helpers.REMINDER_NOTIFICATION

data class Reminder(val minutes: Int, val type: Int) {
    fun isNotification() : Boolean {
        return type == REMINDER_NOTIFICATION || type == REMINDER_ALARM
    }
}
