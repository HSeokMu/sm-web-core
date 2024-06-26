package sm.domain.account.repository

import org.springframework.data.jpa.repository.JpaRepository
import sm.domain.account.model.Account

interface AccountRepository: JpaRepository<Account, Long> {
    fun existsByIdOrEmail(id: String, email: String): Boolean
    fun findByEmail(email: String): Account?
}