package com.mywedding.data.local.interactors.invited

import com.mywedding.domain.model.Invited

interface InvitedInteractor {
    fun insert(invited: Invited)

    fun update(invited: Invited)

    fun delete(invited: Invited)

    fun getAll(): List<Invited>

    fun get(id: String): Invited
}