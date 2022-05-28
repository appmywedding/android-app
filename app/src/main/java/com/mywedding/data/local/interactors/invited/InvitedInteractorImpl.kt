package com.mywedding.data.local.interactors.invited

import com.mywedding.data.local.LocalDatabase
import com.mywedding.data.local.dao.InvitedDao
import com.mywedding.domain.model.Invited
import javax.inject.Inject

class InvitedInteractorImpl @Inject constructor(
    database: LocalDatabase
) : InvitedInteractor {

    private val db: InvitedDao = database.invitedDao

    override fun insert(invited: Invited) {
        db.insert(invited = invited)
    }

    override fun update(invited: Invited) {
        db.update(invited = invited)
    }

    override fun delete(invited: Invited) {
        db.delete(invited = invited)
    }

    override fun getAll(): List<Invited> =
        db.getAll()

    override fun get(id: String): Invited =
        db.get(id = id)
}