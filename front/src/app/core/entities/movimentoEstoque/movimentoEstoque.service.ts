import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { MessageService } from 'primeng/components/common/messageservice';
import { MovimentoEstoqueDto } from './movimentoEstoque-dto';
import { EntityService } from '../entity-service';


@Injectable()
export class MovimentoEstoqueService extends EntityService<MovimentoEstoqueDto> {

    constructor(protected http: HttpClient, protected messageService: MessageService) {
        super(
            http,
            `https://platform-homologx.senior.com.br/t/senior.com.br/bridge/1.0/rest/furb/basico/entities/movimentoEstoque`
        );
    }
}
