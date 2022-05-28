package com.mywedding.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.mywedding.data.local.dao.InvitedDao
import com.mywedding.domain.model.Invited

@Database(
    entities = [
        Invited::class
    ],
    version = 1
)
abstract class LocalDatabase: RoomDatabase() {
    abstract val invitedDao: InvitedDao
}